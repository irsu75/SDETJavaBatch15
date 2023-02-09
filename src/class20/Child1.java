package class20;

     class Child1 extends Parent {

    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.Hello();
        Parent.bye();//accessing static method in a static
        Child1.bye();

        c1.name="Gulzhanar";
        Child1.lastName="Berik";


    }
}
