package HomeWork32;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
          /*
       1) How would handle InputMismatchException? Input Mismatch Exception
       when user enters mismatch value then programmer expected.
        */
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter your account number: ");
            int accountNumber = scan.nextInt();
            System.out.println("Enter your PIN");
        } catch (InputMismatchException invalidAC) {
            System.out.println("Invalid input. Please enter numeric values for your account number");

        }
    }
    }

