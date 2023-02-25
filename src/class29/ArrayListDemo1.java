package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

      //  Dog di=new Dog("Jacky","Persian",15);

        ArrayList<Dog>  dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian",15));
        dogs.add(new Dog("Jami","German",10));
        dogs.add(new Dog("Jimmi","Bulldog",5));
        dogs.add(new Dog("Mami","unknow",1));

        for(Dog d:dogs){
            d.printDogName();
        }


    }
}
