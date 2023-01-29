package class4;

public class ifDemo1 {
    public static void main(String[] args) {

        int money=15000;
        if(money>1000){
            System.out.println("Lets buy an Iphone");

        }
        if (money>2000){
            System.out.println("Lets  also buy a Macbook");
        }
        boolean motherDay=true;
        if(motherDay){
            System.out.println("Happy Mother a day");
        }
        String name="Sardar";

        // equals method is only used for non-primitives
        if (name.equals("Sardar")){
            System.out.println("I Love football ");
        }
    }
}
  /*   Important Notes:
  1. For String we use equals method instead of===sign because it s a non-primitive data type
  2. We can cmd+opt+l(Mac)  ctrl+alt+l(Windows) to format our code.
  3. If we are confused about brackets we can click on opening or closing to check the other part.
   */

