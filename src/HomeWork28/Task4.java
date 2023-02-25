package HomeWork28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
    4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Water");
        drinks.add("Sprite");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Wine");
        drinks.add("Beer");

        for(int i=0; i < drinks.size();i++){

            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "Water");// replacing
            }
        }
        System.out.println(drinks);

    }
}
