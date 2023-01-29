package HomeWorkArrays;

public class ProjectTask6 {
    public static void main(String[] args) {
        /*6)Write a program to swap 2 numbers without a temporary variable?

         */
        int num1=12;
        int num2=15;
        num1= num1 +num2;
        num2= num1- num2;
        num1= num1- num2;
        System.out.println("num1: " + num1+" " + "num2: " + num2);

    }
}
