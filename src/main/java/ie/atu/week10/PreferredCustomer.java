package ie.atu.week10;

public class PreferredCustomer extends Customer{

    //Fields
    private int amount;
    private double discount;
    private double purchase;

    // Default Constructor
    public PreferredCustomer() {
    }

    public PreferredCustomer(int amount, double discount, double purchase) {
        this.amount = amount;
        this.discount = discount;
        this.purchase = purchase;
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

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }
}
