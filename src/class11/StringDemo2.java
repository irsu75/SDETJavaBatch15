package class11;

public class StringDemo2 {
    public static void main(String[] args) {
     //only converts the uppler case letters to the lower case
        String str = "JAVA is FUN";
        String newStr= str.toLowerCase();
        System.out.println(newStr);

        String str2 = "I LOVE JAVA";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
