package class16;

public class TernaryOperator {
    public static void main(String[] args) {
        int number=0;

        // exmple 1
        if(3>2) {
            number=10;
        }else {
            number = 20;
        }
            System.out.println(number);

        number=(3>2)?number=10:20;// example 2 //shorter way of writing if else conditions
        number=(3>2)?(4>5)?15:65:20;
        System.out.println(number);
        }
    }
//if->>number =3>2.....?.....number =  true->>10.....:......false->>>20
