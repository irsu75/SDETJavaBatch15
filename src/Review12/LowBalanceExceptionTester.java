package Review12;

public class LowBalanceExceptionTester {
    public static void main(String[] args) {
        transferBalance(10,15);

    }
   static void transferBalance(double accountBalance,double amountToTransfer){

        if(amountToTransfer>accountBalance){
            throw new LowBalanceException("You do not have enough balance");
        }
    }
}
