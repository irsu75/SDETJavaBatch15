import java.util.Scanner;

public class HomeWorkLoanSpecialist {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("what is the amount of loan needed?");
        int loan = input.nextInt();
        if(loan<=2000000) {
            System.out.println("Congratulation! you are approved");
        }else{
            System.out.println("Sorry!You not qualified for the loan");
        }



    }
}
