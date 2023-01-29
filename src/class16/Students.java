package class16;

public class Students {

    String Name;
    String ID;
     static int numberOfStudents;
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    public static void main(String[] args) {
        Students nezir=new Students();
        nezir.Name="Nezir";
        nezir.ID="1";
        nezir.numberOfStudents++;

        Students ardasher=new Students();
        ardasher.Name="ardasher";
        ardasher.ID="2";
        ardasher.numberOfStudents++;
        System.out.println(Students.numberOfStudents);


    }
}
