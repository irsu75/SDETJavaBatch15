package HomeWork17;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1= new Students("Jon", 4,5,4);
        student1.calculateAverageGrade();
        student1.getInfo();
        Students student2= new Students("Ismail",2,3,5);
        student2.calculateAverageGrade();
        student2.getInfo();
        Students student3 = new Students("Olga",4,5,5);
        student3.calculateAverageGrade();
        student3.getInfo();
        Students student4= new Students("Oleg",5,5,5);
        student4.calculateAverageGrade();
        student4.getInfo();
        Students student5= new Students("Karina",5,5,5);
        student5.calculateAverageGrade();
        student5.getInfo();
    }
}
