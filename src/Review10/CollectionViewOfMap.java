package Review10;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionViewOfMap {
    public static void main(String[] args) {
        Map<String, Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99);           //      K + V = ENTRY OBJECT
        lmap.put("Eggs",6.99);
        lmap.put("Bread",3.99);
        lmap.put("Tea",8.99);
        lmap.put("Cucumber",7.99);
        lmap.put("Eggs",9.5);
        lmap.put("Tomato",5.6);

        Set<String>keys=lmap.keySet();

        for (String key:keys){
            System.out.print(key + " = " + lmap.get(key));
        }
        System.out.println("-----------------------------------------------");

        Iterator<String> iter =keys.iterator();

        while (iter.hasNext()){
            //how to print Key+Value??
            String k=iter.next();
            System.out.print(k+"  ==  "+lmap.get(k));
            System.out.println("---------------------------------------------------");

            //how to print Key+Value??

            Collection<Double>values =lmap.values();
            //print all value
            for(double val:values){
                System.out.print(val+" , ");
            }
        }
    }
}
