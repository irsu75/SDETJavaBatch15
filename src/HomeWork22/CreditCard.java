package HomeWork22;

public class CreditCard {
    /*
  Create a class CreditCard and define variable balance and interest.
   Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */
    int balance=10000;
    int interest=5;
    void calculateInterest(){
        System.out.println("Total balance "+balance+interest*4);
    }

}
class Visa extends CreditCard{

}
class AX extends CreditCard{

    @Override
    void calculateInterest() {
        System.out.println("Total interest "+balance+interest*5);
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.calculateInterest();
        Visa visa=new Visa();
        visa.calculateInterest();
        AX ax=new AX();
        ax.calculateInterest();
    }
}
