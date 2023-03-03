package HomeWork30;
import  java.util.Map;
import java.util.TreeMap;
import java.util.Set;


public class PersonTest {
    public static void main(String[] args) {

        Map<Integer,Person> person=new TreeMap<>();
        person.put(1, new Person( "Ivan", "Petron", 45, 125));
        person.put(2, new Person("Petr", "Sokolov",56,111));
        person.put(3, new Person("Semen", "Slipokov", 41,225));
        person.put(4, new Person("Timur", "Kalimov", 38, 125));

        Set<Map.Entry<Integer,Person>> personDetail=person.entrySet();
        var persondetail=person.entrySet();
        for(var personDetails:persondetail){
            System.out.println(personDetails.getKey()+" "+personDetails.getValue());
            personDetails.getValue();

        }

    }
}
