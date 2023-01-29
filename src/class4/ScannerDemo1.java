package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        //Below line helps us get the input from the keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        String name= input.nextLine();// when we have to taken only one word as input
        System.out.println("Your name is"+name);
      /*  scan.nextLine(); //Trick to make nextLine method work ofter we have used only*/
        System.out.println("Please Enter your full name");

       /* System.out.println("Your full name is"+fullName);*/


    }

}
