package HomeWorkArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectTask2 {
    public static void main(String[] args) {
        /*2)Using Scanner create an array of countries. When an array is created, retrieve all values from it and while
        retrieving those values print capital for each country. (use 2 different loops).
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter countries name");
        String[]arr=new String[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            switch (arr[i].toLowerCase()){
                case "Italy":
                    System.out.println("Italy Capital:" +" Roma");
                    break;
                case "Russia ":
                    System.out.println("Russia Capital:" + "Moscow");
                    break;
                case "Turkey":
                    System.out.println("Turkey Capital:" + "Istanbul");
                    break;
                case "Poland" :
                    System.out.println("Poland Capital:" + "Warsaw");
                    break;
                case "France":
                    System.out.println("France Capital:" + "Paris");
                    break;
                default:
                    System.out.println("Wrong country");

            }
        }

    }
}
