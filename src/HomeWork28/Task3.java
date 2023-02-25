package HomeWork28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
    3)Create an arrayList of words. Remove every word that ends with “e”.
     */

        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Buy");
        words.add("Thanks");
        words.add("Summer");
        words.add("Life");
        words.add("Success");
        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);

    }
}
