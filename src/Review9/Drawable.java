package Review9;

public interface Drawable {
    public static final String TOOL="Pencil";

    void draw(); // by default this method is public abs
    //above is how interface used to be before Java 8
    // after Java 8 static and default methods were added to the interface
    default void print(){
        System.out.println("We are drawing object using" +TOOL);
    }
    static void erase(){
        System.out.println("We are drawing  are erasable");
    }

}
 abstract class Shape{
     public String color;
    protected double widht, lenght;
    Shape(String color, double lenght,double widht){
        this.color=color;
        this.lenght=lenght;
        this.widht=widht;
    }
    public abstract double calculateArea();

}
  class Rectangle extends Shape implements Drawable{

    Rectangle(String color,double length,double width){
        super(color,length,width);
    }
    public double calculateArea() {

        return lenght * widht;
    }

    public void draw(){
        System.out.println("I am drawing rectangle");
    }


  }
  class Square implements Drawable{

    public void draw(){
        System.out.println("I am drawing Square");
    }

    }


