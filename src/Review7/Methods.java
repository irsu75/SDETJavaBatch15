package Review7;

public class Methods {
    // user defined : with return type and without
    //                with parameters and without


    void hello() {
        System.out.println("Hello");

    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    //create a method that returns the largest number between given 2 integer values

    int findLargest(int num1, int num2){
        if (num1 > num2) {
            return num1;
        }else{
            return num2;
        }

    }
    //create a methods that returns an average value of 2 decimal numbers

       private double findAverage(double num1, double num2){
        return (num1+num2)/2;
       }
       // returns reverse String from a given String

          protected StringBuilder reverse (String given){
          StringBuilder sb=new StringBuilder(given);
          return sb.reverse();
          }
       //create a method that will return a min value from given array

        int minValue(int[]numbers){
        int min=0;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<numbers[0]){
                min=numbers[i];

            }
        }
        return min;
        }

    public static void main(String[] args) {
         String name="Mohammed";
         int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();

       obj.sayHello(name);

        System.out.println("___________________________________");
       int largest =obj.findLargest(100,200);
        System.out.println("The largest number is "+ largest);

        System.out.println(obj.findAverage(10,30));

        StringBuilder reverse=obj.reverse ("Hello");
        System.out.println(reverse);

        String myString="Batch15";

       boolean empty =myString.toUpperCase().isEmpty();//false

       char character=myString.trim().charAt(2);//true
        System.out.println(character);

        System.out.println("-----------------------");

    }
}
