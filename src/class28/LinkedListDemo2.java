package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String>subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jura");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String>futureSubjects=new LinkedList<>();

        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String>allSubjects=new LinkedList<>();
        //Get all the entries from subjects list and futureSubjects and put them in allSubjects list

        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String>subjectsLike=new LinkedList<>();
        subjectsLike.add("Java");
        subjectsLike.add("SDLC");
        subjectsLike.add("SQL");
        System.out.println(subjectsLike);

        allSubjects.removeAll(subjectsLike);
        System.out.println(allSubjects);




    }
}
