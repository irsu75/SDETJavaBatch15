package Review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {

    public static void main(String[] args) {
        // Set is a collection of Unique Elements
        Set<String> qaJobs =new LinkedHashSet<>(); // does not maintain the order
        // adding object /elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);


        // HOW TO GET ALL VALUE FROM A Set
        // 1- enhanced for loop
        for(String ga:qaJobs){
            System.out.println(ga+"  ");
        }
        System.out.println("=====================================");

        //2- iterator
        //Iterator Interface has 3 methods: hasNext(), next(), remove();
       Iterator<String> it = qaJobs.iterator();

       while (it.hasNext()) {
            String element = it.next();
            System.out.println(element+"  ");
        }




    }
}
