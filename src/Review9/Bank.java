package Review9;

public class Bank {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("Slava Friz");
        System.out.println("Name of the customer is "+ customer.getName());
        customer.setSsn(12345678);
        System.out.println("SSN of the customer is "+ customer.getSsn());

        PrivateClient pc =new PrivateClient("Diana Hanna",9876213);
        System.out.println("Private client name "+ pc.getName());
        System.out.println("Private client ssn ="+ pc.getSsn());
    }
}
