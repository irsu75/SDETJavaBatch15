package HomeWork30;
import java.util.List;
import  java.util.ArrayList;

public class Task5 {
    /*
    5)Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(150);
        list.add(447);
        list.add(522);
        list.add(150);
        list.add(17);
        int sum=0;
        for (int number:list){
            sum+=number;
        }
        System.out.println(sum);
    }
}
