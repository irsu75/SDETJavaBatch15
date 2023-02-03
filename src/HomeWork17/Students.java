package HomeWork17;

public class Students {

    /*
      2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
          Inside your class also have a method to Calculate Average Grade.
       Test Student class for 5 different students with different marks. Your program should print an average mark
        of each students name
     */
       String name;
       double grade1;
       double grade2;
       double grade3;
       double averageGrade;
       public Students (String stName, double stGrade1,double stGrade2, double stGrade3){
           name=stName;
           grade1=stGrade1;
           grade2=stGrade2;
           grade3=stGrade3;

       }
       public double calculateAverageGrade(){
           averageGrade = (grade1 + grade2 + grade3) / 3;
           return averageGrade;
       }
       void getInfo (){
           System.out.println("The average grade of " + name + " is " + averageGrade);
       }



}
