package Rewiew4;

public class MoreNestedLoops {
    public static void main(String[] args) {


        //what is the output

        for (int i=1; i<=3; i++){
        for(int j=1; j<=4; j++) {
            System.out.println("Hello");
        }
            System.out.println("Bye");
        break;
        }
        System.out.println("-----------------------");

        for (int a=1; a<=3; a++){

        for (int b=1; b<=4; b++) {
            if (b < 2) {
                continue;
            }
            System.out.println("Hello");
        }
                System.out.println("Bye");
            }
        }
        }



