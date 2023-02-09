package class22;

public class Employee {

    String name;
   static int baseSalary=300000;
    static int baseHolidays=10;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 4) + 2000000);

    }
}
class Developer extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 3) + 3000000);
    }
 class QA extends Employee{
        void printSalary(){
            System.out.println((baseSalary*2)+30000);
        }
        void printHoliday(){
            System.out.println(baseHolidays+5);
     }
 }
}
