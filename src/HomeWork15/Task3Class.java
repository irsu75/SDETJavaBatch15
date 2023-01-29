package HomeWork15;

public class Task3Class {
    public static void main(String[] args) {



    /*
    3) Create a method that will print whether given String is palindrome or not.

     return type=>void
     name=>ispalindrome
     parameters=>String inputStr
     example dad=>dad true
     abc =>cba false

     */
           String str="dad";
           StringBuilder st=new StringBuilder(str);
           st.reverse();
           String reversedStr=st.toString();
            if(str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
            }else{
            System.out.println(str+" Not is palindrome");



  /*  void isPalindrome(String str) {
        String str = "dad";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " Not is palindrome");

        }*/


      /*  public static void main (String[] args){
            Task3Class task3Class3 = new Task3Class();
            task3Class3.isPalindrome("Kaya");

       */

        }
    }
}


