package class16;

public class Person {

    private double bankBalance=1250000;
    String Address= "Street 123";//default access level is applied
     public String name="Jon Snow";


    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);

    }
}
