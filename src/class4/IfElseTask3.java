package class4;

import java.util.Scanner;

public class IfElseTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = scanner.nextLine();
        System.out.println("Enter the role: ");
        String role = scanner.nextLine();
        if(role != "Actor") {
            System.out.println("Go to the theater");
        }else{
            System.out.println("Go home");
        String name = scanner.next();
        if(role.equals("Actor") && password.equals("12345")){
            System.out.println("Go to the theater");
        }
        }
    }
}
