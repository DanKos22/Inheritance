package ie.atu.week10;

public class TestPerson {
    public static void main(String[] args) {
        Person Mike = new Person();
        Mike.setName("Mike");
        Mike.setAddress("Newcastle");
        Mike.setNumber("1234");

        System.out.println("\nHere are Mike's details: " + Mike.toString());

        // Use the toString to display the information
        Customer person_1 = new Customer("Frank", "Newcastle", "0500", "666", true);
        System.out.println("Here are the details of the customer: " + person_1.toString());

        // Use the set methods to set the information and the get methods to display the information
        person_1.setName("Frank");
        person_1.setAddress("Newcastle");
        person_1.setNumber("0500");
        person_1.setCustomerNumber("222");
        person_1.setMailingList(true);

        System.out.println("\nHere are the details for the customer: name: " + person_1.getName() + ",\t address:\t"  + person_1.getAddress() + ",\t phone number:\t" + person_1.getNumber() + ",\t customer number:\t" + person_1.getCustomerNumber() + ",\t is on mailing list:\t" + person_1.isMailingList());

        // Instance of PreferredCustomer class
        PreferredCustomer person3 = new PreferredCustomer();
        int amount = 1000;
        person3.setAmount(amount);
        double discount;
        if(amount >= 500 && amount < 1000)
        {
            discount = 5;
            person3.setDiscount(discount);
        }
        else if(amount >= 1000 && amount < 1500)
        {
            discount = 6;
            person3.setDiscount(discount);
        }
        else if(amount >= 1500 && amount < 2000)
        {
            discount = 7;
            person3.setDiscount(discount);
        }
        else
        {
            discount = 10;
            person3.setDiscount(discount);
        }
        System.out.println("\nThe purchase is " + person3.getAmount());
        System.out.println("\nThe discount is " + person3.getDiscount() + "%");

    }
}
