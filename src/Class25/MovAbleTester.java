package Class25;

public class MovAbleTester {

    public static void main(String[] args) {

        MovAble [] movAbles={new Car(), new Dog() };

        for (MovAble m:movAbles){
            m.move();

        OwnAble [] ownAbles={new Car(),new Dog()} ;

        for (OwnAble o:ownAbles){
            o.own();
        }

        }
    }
}
