package class15;

public class break1 {
    public class MethodPractice {

        // create a method which true or false and take int number as a parameter if is
        //even it returns true otherwise it  return false

        boolean isEven(int number){
            boolean flag;
            if(number%2==0){
                flag=true;
            }else {
                flag = false;
            }
            return flag;
        }
        boolean isEven1 (int number){
            if(number%2==0){
                return true;
            }else{
                return false;
            }
        }
    }


}
