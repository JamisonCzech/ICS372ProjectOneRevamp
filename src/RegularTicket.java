import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegularTicket extends Ticket implements Serializable {


    /**
     * Public constructor for RegularTicket Class
     * @param quantity quantity
     *  the Quantity of the tickets.
     * @param price price
     *   the Price of the tickets.
     * @param date
     */
    public RegularTicket(int quantity, double price, Calendar date) {
        this.quantity = quantity;
        this.date = date;
        this.ticketType = "Regular Ticket";
        this.price = setPrice(price);
    }

    /**
     * Sets the ticket price for the
     * regular price.
     * @param ticketPrice ticketPrice
     * @return price
     *  the price of a regular ticket
     */
    @Override
    protected double setPrice(double ticketPrice) {
        this.price = ticketPrice;
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
