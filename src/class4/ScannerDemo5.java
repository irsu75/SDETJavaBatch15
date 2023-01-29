package class4;

import java.util.Scanner;

public class ScannerDemo5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name1");
        String name1 = scan.next("Peter");
        System.out.println("Enter name2");
        String name2 = scan.next("Sam");
        System.out.println("Enter age1");
        int age1 = scan.nextInt();
        System.out.println("Enter age2");
        int age2 = scan.nextInt();
        System.out.println(name1 +"\n"+ name2 +"\n"+ age1 +"\n" + age2);


    }
}
