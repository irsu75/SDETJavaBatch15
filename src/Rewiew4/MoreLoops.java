package Rewiew4;

public class MoreLoops {
    public static void main(String[] args) {

        //what is the output?
        for (int i = 0; i < 3; i++) { //0 1 2 3
            System.out.println(i);

            for (int j = 1; j >= 3; j++) { // this is false
                System.out.println(j);
            }
        }
        System.out.println("----------------------");

        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j >= 3; j++) {
                System.out.println(i+" ");
            }
            System.out.println();

            System.out.println("--------CAR----------");

            for(int m=0; m<=9; m++){

                for (int b=0; b<=9; b++){

                    for(int a=0; a<=9; a++){

                        for(int d=0; d<=9; d++){
                            System.out.println(m + " "+b+ " " + a + " " +d);
                        }

                    }
                }


            }
        }
    }
}