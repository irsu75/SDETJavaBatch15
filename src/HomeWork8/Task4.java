package HomeWork8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter the item and it's price");
            String itemName = scan.nextLine();
            double itemPrice = scan.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay" + totalPrice);

            System.out.println("Please pay for the items");
            double amountPaid = scan.nextDouble();

            if (amountPaid > totalPrice) {
                double change = amountPaid - totalPrice;
                System.out.println("Hey here is your change" + change);
            }
            System.out.println("Thank you for shopping!");
        }
    }
}

