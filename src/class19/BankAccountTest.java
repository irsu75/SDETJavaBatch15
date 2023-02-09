package class19;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=7698453218l;
        ba.money=10000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        //ba.transfer();
        System.out.println("----Creating an Object of Checking account------ ");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=790;
        //features from checking class itself
        check.interest=0;

        check.deposit();
        check.transfer();

        System.out.println("----Creating an Object of Savings account------ ");

        Savings save=new Savings();
        save.accountNumber=87585855964l;
        save.money=7657;
        save.profit=100;
        save.deposit();
    }
}
