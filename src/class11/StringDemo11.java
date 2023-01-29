package class11;

public class StringDemo11 {
    public static void main(String[] args) {
       // returns the new String from this index
        String str="Send it to support channel. More java";
        String newStr=str.substring(28);
        System.out.println(newStr);
        //we also specify the starting point and the ending point
        System.out.println(str.substring(0,27));

    }
}
