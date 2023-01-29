package class11;

public class StringDemo {
    public static void main(String[] args) {
        //Creating an object of the String class
        String strObj= new String("Java");
        //another way of creating an object of String a shorter way
        //mostly this is how we create the objects of String class
        String strIbj2="Java";
        System.out.println(strIbj2.length());
        String str="Banana";
        int len=str.length();
        System.out.println(len);
        String name="Hamid poya";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }

    }
}
