package class24;

public abstract class Animal1 {

    /*

  define the speak eat methods and create 3 subclasses and override the speak eat methods
     */

    abstract void speak();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours a day");
    }
}
  class Dog1 extends Animal1{
      @Override
      void speak() {
          System.out.println("Wuff wuff");
      }
  }
   class Cat1 extends Animal1{

       @Override
       void speak() {
           System.out.println("Meow meow");
       }
   }




