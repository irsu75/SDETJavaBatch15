package class15;

public class MPractice4 {

    /*
    create a method that takes two numbers as parameters and return the larger number time 10 mints
    return type => int
     name => returnLargerNumber
     paramters => int num 1, int num2
     */
    int numbers(int num1,int num2){
        int numbers=0;
        if(num1>num2) {
            numbers = num1;
            System.out.println(num1 + "is the largest");
        }else{
            numbers=num2;
            System.out.println(num2+" is the largest");
        }
        return numbers;


    }
}
