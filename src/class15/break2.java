package class15;

import com.sun.jdi.Method;

public class break2 {

    public static void main(String[] args) {


        MethodPractice mp = new MethodPractice();


        boolean isEven1 = mp.isEven(97);
        boolean isEven2 = mp.isEven(12);
        boolean isEven3 = mp.isEven(20);
        System.out.println(isEven1);
        System.out.println(isEven2);
        System.out.println(isEven3);
    }
}