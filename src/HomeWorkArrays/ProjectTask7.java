package HomeWorkArrays;

public class ProjectTask7 {
    public static void main(String[] args) {

        /*7)Write a java program to check whether a given number is prime or not?
        1. number > 1
        2. numbers should be divisible only by itself
           2(1,2), 3(1,3), 4(1,2,4), 5(1,5),

         */
        int given= 5;
        boolean isPrime=true;
        if(given>1) {
            for(int i=2; i<given; i++) {
                if (given % i == 0) {

                    isPrime=false;
                    break;
                }
            }

        }else{
            isPrime=false;
        }
        System.out.println("Given number "+ given+"+ is Prime?" +isPrime);


    }
}
