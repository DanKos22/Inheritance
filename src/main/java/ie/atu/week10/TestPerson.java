package ie.atu.week10;

public class TestPerson {
    public static void main(String[] args) {
        Person Mike = new Person();
        Mike.setName("Mike");
        Mike.setAddress("Newcastle");
        Mike.setNumber("1234");

        System.out.println("\nHere are Mike's details: " + Mike.getName());
    }
}
