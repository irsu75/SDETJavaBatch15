package HomeWork17;

public class Task3 {

    /*
    3) Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
     and observe result.
     */
    private Task3(){
        System.out.println("Constructor without any parameters");
    }
    public Task3(String name){
        System.out.println("Constructor without any parameters");
    }
    protected Task3(int number){
        System.out.println("Constructor without any parameters");
    }
    public Task3(char c){
        System.out.println("Constructor without any parameters");
    }
    public static void main(String[] args){
        Task3 task3=new Task3();
        Task3 task4=new Task3("Java");
        Task3 task5=new Task3(1000);
        Task3 task6=new Task3('G');

    }

    }

