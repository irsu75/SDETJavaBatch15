package class20;

public class Parent {

    String name;
    static String lastName;

    public Parent(){
        System.out.println("I am a parent class constructor");
    }

    public static void main(String[] args) {

        Parent p=new Parent();
    }
    public void Hello(){
        System.out.println("Hello from parent class");
    }
    protected static void bye(){
        System.out.println("Protected method bye from parent class");
    }
    private void money(){
        System.out.println("private method money from parent class");
    }
}
