package class4;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1");
        float number1=scan.nextFloat();
        System.out.println("Enter number2");
        float number2= scan.nextFloat();
        float res1 = number1 + number2;
        float res2 = number1 - number2;
        float res3 = number1 * number2;
        float res4 = number1 / number2;
        float res5 = number1 % number2;
        System.out.println("Result");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 );



    }
}
