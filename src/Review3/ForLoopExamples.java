package Review3;

public class ForLoopExamples {
    public static void main(String[] args) {

        for (int i=10; i>5; i++){
            System.out.println(i);

            for (int l=5; l<=1; l--){
                System.out.println("Happy");

                for (int m=1; m<=6; m++){

                    if(m%2==0){
                        System.out.println("even number "+ m);
                    }
                }
            }
        }
    }
}
