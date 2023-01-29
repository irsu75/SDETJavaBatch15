package class4;

public class IfElseIZ1 {
    public static void main(String[] args) {

        //if a > b or b < c ,then assign a a value 7, and add b and c
        // else assign a a value 10

        int a = 0;
        int b = 7;
        int c = 25;

        if((a > b) || (b < c)) {
            a = 7;
            int sum = b + c;
            System.out.println("a =" + a);
            System.out.println("sum =" + sum);
        } else {
            a = 10;
            System.out.println("a =" + a);
        }

    }
}
