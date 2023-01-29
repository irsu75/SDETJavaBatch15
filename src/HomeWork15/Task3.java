package HomeWork15;

public class Task3 {

    /*
    3) Create a method that will print whether given String is palindrome or not.
     */
    public static void main(String[] args) {


        String palindrome = "abba", reversePalindrome = "abba";

        if (palindrome.toLowerCase().equals(reversePalindrome.toLowerCase())) {
            System.out.println(palindrome + "  " + "is a Palindrome");
        }
        else{
            System.out.println(palindrome + " " + "is not a Palindrome");
        };
        String palindrome2 = "MAMA", reversePalindrome2 = "MAMA";

        if (palindrome.toLowerCase().equals(reversePalindrome2.toLowerCase())) {
            System.out.println(palindrome2 + "  " + "is a Palindrome");
        }
        else{
            System.out.println(palindrome2 + " " + "is not a Palindrome");
    }
    }}




