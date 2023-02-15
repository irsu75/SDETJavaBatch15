package Class25;
interface WashAble{
    void  wash();
}
public class SmartWatch implements WashAble {

   public void wash(){
        System.out.println("You can wash this smartwatch with out any issues");
    }
}
class Phone implements WashAble{

    public void wash(){
        System.out.println("I am Ip65 Rated you can wash me");
    }
}
class Inverter implements WashAble {
    public void wash() {
        System.out.println("I am Ip65 Rated you can wash me");

    }
}
