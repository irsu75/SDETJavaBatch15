package Review6;

public class Garden {
    public static void main(String[] args) {

        Flower flower1 = new Flower();
        System.out.println(Flower.pretty);
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;
        System.out.println("Hibiscus pretty? " +flower1.pretty);
     //   flower1.size= error- since variables size does not exist in flower class
        //accessing methods of flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();
        System.out.println("Creating second object of the flower class");

        Flower flower2 = new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;

        flower2.bloom();
        flower2.grow();
        flower2.smell();
        System.out.println(flower2.price);

        Flower flower3 = new Flower();
        flower3.name="Orchid";
        flower3.color="white";
        flower3.price=25;

        flower3.bloom();
        flower3.grow();
        flower3.smell();
        System.out.println();
    }
}
