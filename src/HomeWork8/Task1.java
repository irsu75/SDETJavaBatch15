package HomeWork8;

public class Task1 {
    public static void main(String[] args) {

        /*Print number 1 to 50 except those that are divisible by 3*/

            for(int i = 0; i <= 50; i++){
                if(i%3==0)
                continue; //skip condition
                System.out.println(i);

            }
    }
}
