package ie.atu.week10;

public class Customer extends Person {
    private String CustomerNumber;
    private boolean mailingList;

    // Default constructor
    public Customer() {
    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList) {
        // Use the super to grab from the parent class
        super(name, address, number);
        CustomerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{"+ super.toString() +
                "CustomerNumber='" + CustomerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
