package class8;

public class NestedLoops3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { //outer for loop


            for (int j = 0; j < 5; j++) { //inner for loop
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
