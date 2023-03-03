package Review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import  java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        Map <String,Double> grocery=new HashMap<>();
        // to store values inside the map
        grocery.put("Milk",5.99);           //      K + V = ENTRY OBJECT
        grocery.put("Eggs",6.99);
        grocery.put("Bread",3.99);
        grocery.put("Tea",8.99);
        grocery.put("Cucumber",7.99);
        grocery.put("Eggs",9.5);
        grocery.put("Tomato",5.6);

        double teaPrice=grocery.get("Tea"); // Return the value to which the specified key is mapped
        System.out.println(teaPrice);

        System.out.println(grocery);

      int size =grocery.size();
        System.out.println("Number of entry objects = "+size);

        Map<String, Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99);           //      K + V = ENTRY OBJECT
        lmap.put("Eggs",6.99);
        lmap.put("Bread",3.99);
        lmap.put("Tea",8.99);
        lmap.put("Cucumber",7.99);
        lmap.put("Eggs",9.5);
        lmap.put("Tomato",5.6);

        System.out.println("Order is preserved "+ lmap);


        Map<String, Double>tmap= new TreeMap<>();
        tmap.putAll(grocery);
        tmap.putAll(lmap);
        System.out.println("Size =" +tmap.size());
        System.out.println("Sorted order "+tmap);



    }
}
