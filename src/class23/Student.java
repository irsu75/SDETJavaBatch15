package class23;

public class Student {
    /*
  Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
You do not have permission to send messages in this channel.

     */
   public void study(){
       System.out.println("Study is good");
   }
     void doHomeWork(){
        System.out.println("Do homeworks");

    }
    void practice(){
        System.out.println("practicing the skills");



    }
}

class SyntaxStudent extends Student{
    public void study(){
        System.out.println("Syntax Student must study Programming");
    }
    public void doHomeWork(){
        System.out.println("Syntax Student must solve the homeworks before next class");

    }
    public void practice(){
        System.out.println("Syntax Student must practice Repls");
    }


}
class CollegeStudent extends Student{
    void practice(){
        System.out.println("College students must practice to get good grades");
    }
}
class SchoolStudent extends Student{

}
