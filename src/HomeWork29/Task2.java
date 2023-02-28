package HomeWork29;

import class16.Student;

import java.util.HashMap;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        /*
     Create a Set collection that will hold Objects of Student Type.
      In this set we do not care about the insertion order.
      Each student object should have name and studentID. Display name of each student.
You do not have permission to send messages in this channel.
 */
        HashMap<String, Integer> students = new HashMap<>();            //    ato tohe pravilno
        students.put("Sam", 7525);
        students.put("Maks", 4369);                                     //  cdelano, no nado bilo Set
        students.put("Roma", 1245);
        students.put("Simon", 14589);
        students.put("Nikolos", 4712);
        students.put("Mark", 2365);

        System.out.println(students.keySet());

    }
}





