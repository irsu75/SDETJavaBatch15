package HomeWork11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
     /*   3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

      */
        Scanner input=new Scanner(System.in);
        System.out.println("Please eter Mom's first name");
        String mom= input.next();
        System.out.println("Please enter Dad's first name");
        String dad= input.next();
        System.out.println("Are you expecting Boy or Girl");
        String baby= input.next();
        String babyName;

        if(baby.equalsIgnoreCase("boy")) {
            babyName = dad.substring(0, 3) + mom.substring(2).toUpperCase();
        }else{
            babyName =mom.substring(0,2) + dad.substring(3).toUpperCase();
        }
        System.out.println("You can name your child" + babyName.toUpperCase());

    }
}
