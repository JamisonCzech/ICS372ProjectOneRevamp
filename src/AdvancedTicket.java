import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class AdvancedTicket extends Ticket implements Serializable {

    /**
     * Public constructor for AdvancedTicket Class
     * @param quantity quantity
     *  the Quantity of the advanced tickets.
     * @param price price
     *   the Price of the advanced tickets.
     * @param date
     */
    public AdvancedTicket(int quantity, double price, Calendar date) {
        this.quantity = quantity;
        this.date = date;
        this.ticketType = "Advance Ticket";
        this.price = setPrice(price);
    }

    /**
     * Sets the ticket price for the
     * advanced price.
     * @param ticketPrice ticketPrice
     * @return price
     *  the price of a advanced ticket
     */
    @Override
    protected double setPrice(double ticketPrice) {
        this.price = ticketPrice * .7;
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
