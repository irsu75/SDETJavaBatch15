package Review3;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("-------------LOGICAL AND-------------------");


        boolean loginButtonDisplayed=true;
        boolean logicalButtonClikable=false;
        if(loginButtonDisplayed && logicalButtonClikable) {
            System.out.println("Test case is passed");
        }else{
            System.out.println("Test case failed");
            System.out.println("----------LOGICAL OR------------------");
            boolean dashboard=true;
            String message="Welcome admin";
            if(dashboard || message.equals("Welkom admin")) {
                System.out.println("User is successfully logged in");
            }else{
                System.out.println("User is not logged in");

                System.out.println("-------------------LOGICAL NOT-----------------");

                boolean b=true;
                System.out.println(!true); //false

                boolean agreeCheckboxSelected=false;
            if(!agreeCheckboxSelected) {

                System.out.println("I am cliking on checkbox");
                System.out.println("I am clicking on submint button");

                boolean boo=!false;
                System.out.println(boo);
            }

            }
        }
    }
}
