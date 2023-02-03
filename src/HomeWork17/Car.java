package HomeWork17;

public class Car {
    /*
    1) Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String car;
    int age;
    public Car (String carName, int carAge){
        car=carName;
        age=carAge;
    }
    public Car(){

    }
    void printInfo() {
        System.out.println("Model "+car+ " Years " +age);
    }


}
