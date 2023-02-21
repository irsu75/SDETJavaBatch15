package Project2;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
 Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
 Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
 in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your cod
*/
    abstract void getPercentage();
}
   class StudentA extends Marks{

    double physics;
    double chemistry;
    double math;

    public StudentA(double physics, double chemistry, double math){
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
    }

       @Override
       void getPercentage() {
           System.out.println("Average marks of student Class A "+ (physics+chemistry+math)/3);
       }
   }
   class StudentB extends Marks{

    double physics;
    double chemistry;
    double math;
    double history;

    public StudentB (double physics, double chemistry, double math, double history){
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
        this.history=history;
    }

       @Override
       void getPercentage() {
           System.out.println("Average marks of student Class B "+ (physics+chemistry+math+history)/4);
       }
   }
