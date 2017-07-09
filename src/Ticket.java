import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public abstract class Ticket implements Serializable {

    protected int quantity;
    protected Calendar date;
    protected double price;
    protected int serialNumber;
    protected String ticketType;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public String getType() {
        return this.getClass().getName();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return a Calendar date
     */
    public Calendar getDate() {

        return date;
    }

    public void setDate(Calendar date) {
        sdf.format(date);
                this.date = date;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return quantity * price;
    }

    protected abstract double setPrice(double ticketPrice);

    /**
     * Accepts a Date object and returns the object date in
     * toString form
     *
     * @param inDate Date object
     * @return date
     * returns the date as a string.
     */
    public String convertStringToDate(Date inDate)
    {
        String dateString = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");

        try{
            dateString = dateFormat.format( inDate );
        }catch (Exception ex ){
            System.out.println(ex);
        }
        return dateString;
    }
}
