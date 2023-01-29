package Review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {

        //let's create an array of names Scanner

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names yoy want to store");
        int size= scan.nextInt();
        String[] name= new String[size];
    //this loop stores elements inside the array
        //regular for loop work with indexes
        for(int i=0; i< name.length; i++){
            System.out.println("Please Enter name");
            name[i]=scan.next();
        }
        //using loop bellow we can retrieve element
        // enhanced for loop work with variable
        for(String n:name){
            System.out.println(n);
        }
    }
}
