package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String>studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        Collection<String>value=studentsMap.values();
        System.out.println(value);
        //remove all value whish contains the letter i

        value.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);

        //remove the entries if key is greater than 2 and value contains the letter i



    }
}
