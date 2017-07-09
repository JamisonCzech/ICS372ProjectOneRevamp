import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class StudentAdvancedTicket extends Ticket implements Serializable {

    /**
     * Public constructor for StudentAdvancedTicket Class
     * @param quantity quantity
     *  the Quantity of the studentAdvancedTicket tickets
     *  purchased.
     * @param price price
     *   the Price of the studentAdvancedTicket tickets.
     * @param date
     */
    public StudentAdvancedTicket(int quantity, double price, Calendar date) {
        this.quantity = quantity;
        this.date = date;
        this.ticketType = "Student Advanced Ticket";
        this.price = setPrice(price);
    }

    /**
     * Sets the ticket price for the
     * studentAdvanced ticket price.
     * @param ticketPrice ticketPrice
     * @return price
     *  the price of a regular ticket
     */
    @Override
    protected double setPrice(double ticketPrice) {
        this.price = ticketPrice * .5;
        return this.price;
    }

    /**
     *
     * @return toString representation
     */
    public String toString() {
        Date date =  this.date.getTime();
        String outputString = "Ticket Serial Number: " + this.getSerialNumber()
                + "Type: " + this.ticketType
                + "Date: " + convertStringToDate(date)
                + "Price: " + this.price
                + "Quantity: " + this.quantity
                + "Total: " + this.getTotal();

        return outputString;
    }
}
