import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * This class creates a Show for a client holding a show name, clientID, and
 * start and end date for the show. creation
 *
 * @author Matt Carlson, Jamison Czech, Slava Makharovich, Prashant Shrestha
 */

public class Show implements Serializable {

    private String showName;
    private String clientID;
    private Calendar startDate;
    private Calendar endDate;
    private double RegularTicketPrice;
    private double AdvancedTicketPrice;
    private double StudentAdvancedticketPrice;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates a new Show
     *
     * @param showName
     * @param clientID
     * @param startDate
     * @param endDate
     */
    public Show(String showName, String clientID, Calendar startDate,
                Calendar endDate, double ticketPrice) {
        this.showName = showName;
        this.clientID = clientID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.RegularTicketPrice = ticketPrice;
        this.AdvancedTicketPrice = RegularTicketPrice * 0.7;
        this.StudentAdvancedticketPrice = this.AdvancedTicketPrice * .5;
    }


    //String dateToStart=sdf.format(startDate);
    //String dateToEnd=sdf.format(endDate);


    public double getRegularTicketPrice() {
        return RegularTicketPrice;
    }


    public void setRegularTicketPrice(double regularTicketPrice) {
        RegularTicketPrice = regularTicketPrice;
    }


    public double getAdvancedTicketPrice() {
        return AdvancedTicketPrice;
    }


    public void setAdvancedTicketPrice(double advancedTicketPrice) {
        AdvancedTicketPrice = advancedTicketPrice;
    }


    public double getStudentAdvancedticketPrice() {
        return StudentAdvancedticketPrice;
    }


    public void setStudentAdvancedticketPrice(double studentAdvancedticketPrice) {
        StudentAdvancedticketPrice = studentAdvancedticketPrice;
    }


    /**
     * Getter for the name of the show
     *
     * @return a String of the show name
     */
    public String getShowName() {
        return showName;
    }

    /**
     * Getter for client ID for the show
     *
     * @return a String of the client ID
     */
    public String getClientID() {
        return clientID;
    }


    public Date setStartDate(Calendar calendar) {
        Date startDate = calendar.getTime();

        return startDate;
    }




    public Date setEndDate(Calendar calendar) {
        Date endDate = calendar.getTime();
        return endDate;
    }




    /**
     * checks if show in the days range
     *
     * @param testDate
     * @return true if testDate with in range
     */
    boolean isWithinRange(Date testDate) {

        Date newStartDate = this.setStartDate(startDate);
        Date newEndDate = this.setEndDate(endDate);

        if (testDate.after(newStartDate) && testDate.before(newEndDate)) {
            return true;
        }
        return false;
    }



    /**
     * String representing a Show
     *
     * @return a string representing a Show
     */
    @Override
    public String toString() {
        return "Show: " + getShowName() + ", Client ID: " + getClientID() + ", Start Date: "
                + sdf.format(setStartDate(startDate)) + " ,End Date " + sdf.format(setEndDate(endDate));
    }
}
