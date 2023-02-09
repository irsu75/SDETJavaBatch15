package class20;

import HomeWork19.Teacher;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }
    String teacherName;
    String teacherId;

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();

        java.teacherName="Asel";
        java.teacherId="A67";

        java.homework();//public
        java.grade(); //protected
        java.scholarship(); //default


    }
}
