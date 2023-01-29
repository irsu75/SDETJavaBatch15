package Review2;

public class NestedIF {
    public static void main(String[] args) {
        /* nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another
         */
        boolean vaccine=true;
        int dose =2;
        if (vaccine) {
            System.out.println("How many doses you have");
            if (dose == 1) {
                System.out.println("you need a second shot");
            } else {
                System.out.println("you are fully vacineted");

            }
        }else {
            System.out.println(" I do not have a vaccine");
        }

    }
}
