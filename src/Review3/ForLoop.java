package Review3;

public class ForLoop {
    public static void main(String[] args) {

        //  1. initialization
        //  2. condition
        //  3. if true -> code goes inside the loop baby
        //  4. goes back
        //  5.

        for(int i=1; i<=5; i++){
            System.out.println("Hello "+ i);

            System.out.println("----------------------------");
            for(int a = 0; a < 8; a+= 4 ){
                System.out.println("Bay");

                for(int b=2; b>10; b++){
                    System.out.println(i);

                    System.out.println("End");

                    System.out.println("-------------------------------------");

                    for (int j=3; j<10; j--){
                        System.out.println(j);
                    }

                }
            }
        }
    }
}
