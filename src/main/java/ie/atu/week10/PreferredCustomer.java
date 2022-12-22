package ie.atu.week10;

public class PreferredCustomer extends Customer{

    //Fields
    private int amount;
    private double discount;

    // Default Constructor
    public PreferredCustomer() {
    }

    public PreferredCustomer(int amount, double discount) {
        this.amount = amount;
        this.discount = discount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
