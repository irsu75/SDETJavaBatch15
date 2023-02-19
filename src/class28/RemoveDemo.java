package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
     // it does not work in java 9 and below
        var name="jdhfgshskdsert";
        var c='s';
        var f=12.5;
      // it works from java 6 to java 19
    /*    Iterator<String>iterator= words.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();                 this is long method
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);

     */
        //does not work in java 7
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);


    }
}
