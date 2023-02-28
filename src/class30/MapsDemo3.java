package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo3 {
    /*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert
    7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {
        HashMap<String,Integer>floor=new HashMap<>();
        floor.put("Google",1);
        floor.put("Syntax",2);
        floor.put("Apple",3);
        floor.put("IBM",4);
        floor.put("Samsung",5);
        floor.put("McDonald",6);
        floor.put("Samsung",7);
        System.out.println(floor.size());

        floor.replace("Shell",4);
        System.out.println(floor);
        floor.remove(7);
        System.out.println(floor);

    }

}
