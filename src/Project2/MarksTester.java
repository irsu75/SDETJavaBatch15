package Project2;

public class MarksTester {
    public static void main(String[] args) {

   Marks[] marks={new StudentA(95,88,76),new StudentB(99,85,79,65)};

   for(Marks m:marks){
       m.getPercentage();
   }
    }
}
