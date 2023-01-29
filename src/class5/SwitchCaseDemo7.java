package class5;

import java.util.Scanner;

public class SwitchCaseDemo7 {
    public static void main(String[] args) {
        //CALCULATOR

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();

        int res;
        System.out.println("Operation");
        String operation = scanner.nextLine();
        operation = scanner.nextLine();
        switch (operation) {
            case "+":
                res = num1 + num2;
                System.out.println("Result:" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result:" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result:" + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else{
                    res = num1 / num2;
                    System.out.println("Result:" + res);
                }
                    break;

        }
    }
}
