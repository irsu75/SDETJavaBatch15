package Review6;

public class MoreStringMethods {

    public static void main(String[] args) {
        //                   1  2    3      4     pazdelit stringi
        String myString = "Today is February 2";

        String[] strArray = myString.split(" ");

        for (String s:strArray) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------------");

        System.out.println(myString);//today is february 2

        String newStr=myString.substring(9);
        System.out.println(newStr);

        newStr=myString.substring(9,17);//two int begining and end
        System.out.println(newStr);

        int index=newStr.indexOf('b');
        System.out.println(index);

        String anotherStr="Today is Thursday";

        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is = "+index);


    }
}