package Project2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle &  Square that implements functionality defined in the Shape Interface. Test your code
 */

    void calculatePerimeter();
    void calculateArea();
}
 class Circle implements Shape{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }
     @Override
     public void calculatePerimeter() {
         System.out.println("Perimeter of Circle "+2*(Math.PI*radius) );

     }

     @Override
     public void calculateArea() {
         System.out.println("Area of Circle "+Math.PI*(radius*radius));
     }
 }
 class Square implements Shape{

    double side;
    Square(double side){
        this.side=side;
    }
     @Override
     public void calculatePerimeter() {

         System.out.println("Perimeter of Square "+(side*side));
     }

     @Override
     public void calculateArea() {
         System.out.println("Area of Square "+(4*side));
     }
 }
