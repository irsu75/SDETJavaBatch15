package HomeWork15;

public class Task5 {
    /*
    5) Write a method to return whether given number is prime or not?

       return type=> boolean
       name=>isPrime
       parameter=> int number
     */
          boolean isPrime(int number){
              boolean flag=true;
          if (number>1){
              for (int i =2; i < number; i++){
          if (number%1==0) {
              flag=false;
              break;
          }
              }

          }else{
              flag=false;
          }
          return flag;
          }

    public static void main(String[] args) {
              Task5 task5=new Task5();
              System.out.println(task5.isPrime(13));
    }

    }

   /*
    public static void main(String[] args) {

        int number=5;
        boolean flag=true;
        if (number>1){
            for(int i = 2; i < number; i++){
        if (number%i==0) {
            flag = false;
            break;
        }
            }
        }else{
            flag = false;
        }
        System.out.println(number+" is prime "+flag);
    }
}
*/

