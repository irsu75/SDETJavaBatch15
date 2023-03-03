package HomeWork30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    /*
  4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection
     */
    public static void main(String[] args) {

        Set<String> store=new LinkedHashSet<>();
        store.add("I");
        store.add("Like");
        store.add("To");
        store.add("Travel");

        for (String i:store){
            System.out.print(i+ " ");
        }
    }
}
