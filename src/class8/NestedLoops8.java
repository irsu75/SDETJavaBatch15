package class8;

public class NestedLoops8 {
    public static void main(String[] args) {

        /* 0 1 2 3 4 5
           0 2 4 6 8 10
           0 3 6 9 12 15
         */

      /*  for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.println(j+" ");
            }
            System.out.println();*/

            for (int i = 0; i <=5; i++) {
                System.out.println(i + " ");
            }
                 System.out.println();
                 for (int i = 0; i <=5; i++) {
                     System.out.println(2 * i + " ");
                 }

                     System.out.println();
                     for (int i = 0; i <=5; i++) {
                         System.out.println(3*i+" ");

                }
        }
    }

