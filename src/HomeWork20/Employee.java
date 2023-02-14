package HomeWork20;

public class Employee {
    /*
 2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
     */

    String name;
    int Id;
    Employee(String name, int Id){
        this.name=name;
        this.Id=Id;

    }
    void printInfo(){
        System.out.println("Employee name is "+name+" and his Id "+Id);
    }
}
 class FullTime extends Employee{

    int Hours;


     public FullTime(String name, int Id, int hours) {
         super(name, Id);
         this.Hours = hours;
     }
     void displayData(){
         System.out.println("Employee "+name+" and his Id is "+Id+" works a full time shift with Hours "+Hours);
     }
 }
 class PartTime extends Employee{

       int bonus;
      PartTime(String name, int Id, int bonus) {
         super(name, Id);
         this.bonus=bonus;
     }
     void displayInfo(){
         System.out.println("Part time employee is "+name+" and his Id is "+Id+ " gets bonus of "+" bonus");
     }
 }

 class Tester extends FullTime{

     int incentives;
      Tester(String name, int Id, int hours, int incentives) {
          super(name, Id, hours);
          this.incentives = incentives;
      }void printTester(){
         System.out.println("Employee name is "+name+" his Id is "+Id+" he works hours  "+Hours+" he takes incentives of "+incentives);

          }

     public static void main(String[] args) {
         Employee emp=new Employee("Sam",1598);
         emp.printInfo();

         FullTime full=new FullTime("Robert",8486,8);
         full.displayData();

         PartTime part=new PartTime("Nik",1789,5000);
         part.displayInfo();

         Tester tester=new Tester("John",4512,40,55);
         tester.printTester();

     }
     }


