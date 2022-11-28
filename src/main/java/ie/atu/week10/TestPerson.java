package ie.atu.week10;

public class TestPerson {
    public static void main(String[] args) {
        Person Mike = new Person();
        Mike.setName("Mike");
        Mike.setAddress("Newcastle");
        Mike.setNumber("1234");

        System.out.println("\nHere are Mike's details: " + Mike.toString());

        // test customer
        Customer person_1 = new Customer("Frank", "Newcastle", "0500", "222", true);

        System.out.println("\nHere are the details for the customer: " + person_1.toString());

    }
}
