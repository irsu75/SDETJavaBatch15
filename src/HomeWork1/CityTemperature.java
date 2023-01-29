package HomeWork1;
import java.util.Scanner;
public class CityTemperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your City");
        String city=input.nextLine();
        System.out.println("Please Enter the temperature in Fahrenheit");
        double temp= input.nextDouble();
        temp=(temp-32)*5/9;
        System.out.println("Your temperature in "+city+" is "+temp+" degree");
    }
}
