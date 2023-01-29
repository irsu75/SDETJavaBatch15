package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Write a program that reads a range of integers
        (start and end point), provided by a user then
        from that range prints the sum of the even and add integers.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        for (int i = start; i <=end; i++){
            System.out.println(i);
            if(i%2==0) {
      /*          evenSum += i; // can also be written like this
                oddSum=oddSum+i; //  can also be written like this oddSum+=i
            }else{
                System.out.println("Sum of all the Even Numbers" +evenSum );
                System.out.println("Sum of all the Odd Numbers" +oddSum);*/
            }
        }
    }
}
