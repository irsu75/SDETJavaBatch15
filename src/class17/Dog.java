package class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogname, String dogbreed, String dogColor,int dogAge, double dogWeight ){
        name=dogname;
        breed=dogbreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name " +name+" Breed "+breed+" age "+age+ " Weight " + weight);
    }
}
