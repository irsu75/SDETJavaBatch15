package class13;

public class Task3 {
    public static void main(String[] args) {
         /*   3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

          */
        String dadsname="Daniel";
        String momsname= "Mary";
        String expactation="Boy";

        if(expactation.equalsIgnoreCase("boy")) {
            String firstHalf = dadsname.substring(0, dadsname.length() / 2);
            String secondHalf = momsname.substring(momsname.length() / 2);
            System.out.println(firstHalf + secondHalf);


        }
    }
}
