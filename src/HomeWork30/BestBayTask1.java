package HomeWork30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBayTask1 {
    /*
   1) Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {

        Map<String, Integer> store=new HashMap<>();
        store.put("Printer",7664847);
        store.put("TV",7879885);
        store.put("Computer",9875642);
        store.put("Playstation",546321);
        store.put("Phone",745219);

        Set<Map.Entry<String,Integer>> entrySet =store.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getValue()+" "+entry.getKey());

        }
    }
}
