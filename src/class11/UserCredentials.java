package class11;

import java.util.Scanner;

public class UserCredentials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Get username and password from user
        System.out.print("Enter username:");
        String username=sc.nextLine();
        System.out.println("Enter password:");
        String password=sc.nextLine();
        System.out.println("Confirm password:");
        String confirmedPassword=sc.nextLine();

        //Check if username and password are not empty
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password cannot empty");
            return;
        }
        //Check if password is at least 8 characters
        if(password.length()<8) {
            System.out.println("Password is too short");
            return;
        }
        //Check if password contains username
        if(password.contains(username)) {
            System.out.println("Password cannot contain username");
            return;
        }
        //Check if password matches confirmed password
        if(!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");
            return;
        }
        //if all requirements are met
              System.out.println("Your username and password has been created");
        }

    }

