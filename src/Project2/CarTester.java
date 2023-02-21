package Project2;

public class CarTester {
    public static void main(String[] args) {

        Sedan sedan=new Sedan(10000,"Gold",25);
        System.out.println(sedan.calculateSalePrice());
        Truck truck=new Truck (50000,"Black",170);
        System.out.println(truck.calculateSalePrice());
    }
}
