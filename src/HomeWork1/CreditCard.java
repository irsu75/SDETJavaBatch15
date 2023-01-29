package HomeWork1;
import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card with us?");
        String card = input.next();
        if(card.equals("No")) {
            System.out.println("What is your current balance?");
        }
        int balance = input.nextInt();
        if (balance > 1000) {
            System.out.println("Please pay off the balance immediately");
        }else{
            System.out.println("Please use your available balance");

        }

    }
}
