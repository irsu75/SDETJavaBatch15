package class8;

public class NestedLoops7 {
    public static void main(String[] args) {

          /* 0 1 2 3 4 5
               1 2 3 4 5
               2 3 4 5
         */

        for (int i = 0; i < 3; i++) { // executes the below code 3 times
            for (int j = 0; j <=5; j++) {
                if (i== 1 && j == 0||i==2 && j ==0 || i== 2 && j==1){
                    System.out.println("");
                    continue;
                }
            }
                System.out.println(i +" ");// prints the value of j from 1 to 5
            }
            System.out.println();
    }
}
