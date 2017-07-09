import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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

}
