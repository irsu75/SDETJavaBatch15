package HomeWork28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
    2)Create an arraylist of cars and retrieve all the values using 3 different ways
     */

        ArrayList<String>cars=new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Lexus");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Bmw");
       // 1)
        System.out.println(cars);

        //2)
        for(String car:cars){
            System.out.println(car);
        }

       //3)
        for(int i=0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }


    }
}
