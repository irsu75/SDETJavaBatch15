package Review6;

public class StringMethods {
    public static void main(String[] args) {

        String str="Hello";


        System.out.println(str.length());//5 bykv v clove hello
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1)); // bykva e v clove hello(1)

        String newString=str.concat("friends");
        System.out.println(newString); //Hello friends

        System.out.println(str); //Hello
        str.toLowerCase(); //hello
        str=str.toLowerCase();
        str=str.concat("friends");
        System.out.println(str);

        //check if length of the string is more than 0
        boolean empty=str.isEmpty();//this method is return value always boolean
        System.out.println(empty);

        String str1="  Review B15   ";
        String newStr1=str1.trim(); //this method says as remove any l

        System.out.println(str1);
        System.out.println(newStr1);


    }


}
