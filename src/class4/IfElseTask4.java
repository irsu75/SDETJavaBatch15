package class4;

import java.util.Scanner;

public class IfElseTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name");
        String username = scanner.nextLine();
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        if(username.equals("Admin") && password.equals("33333")){
            System.out.println(" All users");

        }else{
            System.out.println("Hello, what is your name?");
            String name = scanner.nextLine();
        }


    }
}
