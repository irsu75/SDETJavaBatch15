package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str="KhtrwqnOldpsacOPUY452579841mmmhgfv^%3333&**(*)";
        //replaces All lower case letters from A to K
        System.out.println(str.replaceAll("[A-K]","#"));
        //replaces All lower case letters from  a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //replaces All lower case letters from  0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        //  replaces All lower case letters from A-Z and lower case letters from a-z and numbers as well
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //replaces All lower case letters from  A-Z and a-z and 0-9
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // break till
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));




    }
}
