package class16;

public class SyntaxEmployee {

    String empID;
    double salary;
    static String CEO="Sumair";//is going to be same we create this one as static


     /*
    Create a Class called SyntaxEmployee:
    Create three variables empID, Salary and set the CEO to "Sumair"
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID, salary and CEO for each of the objects
     */
     public static void main(String[] args) {

         SyntaxEmployee emp1=new SyntaxEmployee();
         emp1.empID = "S123";
         emp1.salary=1000;

         SyntaxEmployee emp2=new SyntaxEmployee();
         emp2.empID ="S124";
         emp2.salary=120000;
         System.out.println(emp1.empID);
         System.out.println(emp1.salary);
         System.out.println(emp1.CEO);



     }

}
