package class17;

public class Student {
    /*
    Create a class call it Student define 4 instance fields like id Name age weight
    create 5 objects of this class do this task without constructor and with constructors
     */

    String name;
    String id;
    int age;
    double weight;

    Student(String sName,String sId, int sAge,double sWeight){
        id=sId;
        name=sName;
        age=sAge;
        weight=sWeight;

    }

    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }


}
