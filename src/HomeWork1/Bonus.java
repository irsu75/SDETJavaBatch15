package HomeWork1;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How may years you worked us?");
        byte years= input.nextByte();
        if(years>=5) {
            System.out.println("Your are eligible for a bonus!");
        }else {
            System.out.println("You are not eligible a bonus");
        }
        System.out.println("What is your annual salary?");
        int salary= input.nextInt();
        if(salary>50000) {
            System.out.println("Your bonus is $5000");
        }else{
            System.out.println("Your bonus is $3000");
        }
    }
}
