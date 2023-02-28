package HomeWork29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        /*
     Create a Set of cities in which you want to make sure that insertion order is maintained.
      Then remove any city that starts with "A";
         */
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Prague");
        cities.add("Amsterdam");
        cities.add("Moscow");
        cities.add("Astana");
        cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);
    }
}
