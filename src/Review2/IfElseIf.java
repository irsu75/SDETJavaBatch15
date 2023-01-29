package Review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more condition to test
        if (boolean condition){
        code A;
        }else if (boolean condition){
        code B;
        }else if (boolean condition){
        Code C;
        }

         */
        /*Check homework
                if you completed more than 25-> great job;
                if you completed more than >20 -> good job
                if you competed more than >10-> ok job
                if you completed more than >5 -> not good job
         */
        int homework = 30;

        if (homework > 25) {
            System.out.println("Great job!!");
        } else if (homework > 20) {
            System.out.println("Good job");
        } else if (homework > 10) {
            System.out.println("Ok job");
        } else if (homework > 5) {
            System.out.println("Not good job");

        }
    }
}









