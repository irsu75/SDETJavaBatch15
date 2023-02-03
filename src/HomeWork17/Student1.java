package HomeWork17;

public class Student1 {
    /*
    5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address of given
      student using displayInfo method.
     */
    String name;
    String address;

     Student1(String student1Name, String student1Address) {
        name = student1Name;
        address = student1Address;
    }

    void displayInfo() {
        System.out.println(" name " + name + " address " + address);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Robert", "West4");
        student.displayInfo();

        }


    }



