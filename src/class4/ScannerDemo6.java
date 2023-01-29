package class4;

import java.util.Scanner;

public class ScannerDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price item");
        int price= scan.nextInt();
        System.out.println("Enter a name item");
        String item = scan.next();
        System.out.println(item +" " + price);
    }
}
