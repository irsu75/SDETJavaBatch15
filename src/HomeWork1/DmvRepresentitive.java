package HomeWork1;
import java.util.Scanner;
public class DmvRepresentitive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your age?");
        int age= input.nextInt();
        if(age>=18) {
            System.out.println("You are eligible for driver License");
        }else{
            System.out.println("Will offer you learners permit");
        }
    }
}
