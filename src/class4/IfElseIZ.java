package class4;

public class IfElseIZ {
    public static void main(String[] args) {

        int ageA;
        int ageN;
        int ageS;

        //(ageA > ageS) && (ageN > ageS);
        int a = 7;
        int b = 7;
        System.out.println(5 > 7);
        System.out.println((a >= b) || (a < b));
        System.out.println(a != b);
        System.out.println(!(a == b));

        //if-then
//          if() {

//          }
        //   if a equals b,then a plus b

        if (a == b) {
            System.out.println(a + b);
        }


        // if a equals b,then a plus b, else subtract from a the value b

        //if-else
        //if() {
        //      } else {
//        }
        if (a == b) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);

        }
        // if a equals b,then a plus b, if a > b, then assign a  a value b, else subtract from a the value b
        //if - else if - else
        //if() {
        //} else if () {
        //} else {
        //}

        if (a == b) {
            System.out.println(a + b);
        } else if (a > b) {
            a = b;
            System.out.println(a);
        } else {
            System.out.println(a - b);
        }
    }
}









