package HomeWork17;

public class  Student{
    String name;
    String id;
    int age;
    double weight;
    public Student (String studentName,String studentId,int studentAge,double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    public Student(String Alex,String studentName){

    }
    void printInfo(){
        System.out.println(" name " +name+ " id " +id+ " age " +age+ " weight " +weight);
    }
}
