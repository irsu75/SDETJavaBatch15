package class27;

import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Sam");
        names.add("Nelson");
        names.add("Zafar");
        names.add("Irma");
        names.add("John");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);

        names.set(2,"James Bond");
        System.out.println(names);
        System.out.println(names.indexOf("John"));



    }
}
