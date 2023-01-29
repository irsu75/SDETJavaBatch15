package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { //converts the text to Lowercase USA=>usa
            case "usa":
                System.out.println("Burgers");
            case "Italy":
                System.out.println("Pasta");
            case "Afghanishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
