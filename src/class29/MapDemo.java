package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

      //  HashMap<String,Integer> groceries = new HashMap<>();                                you may use this method
      //  LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();                      you may use this method
        TreeMap<String,Integer>groceries=new TreeMap<>();                                //you may use this method
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Meat");
        System.out.println(groceries);


    }
}
