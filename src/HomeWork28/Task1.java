package HomeWork28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*
    1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
        ArrayList<String>names= new ArrayList<>();
        names.add("Leo");
        names.add("Mark");
        names.add("Michail");
        names.add("Ella");
        names.add("Ann");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mark"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
