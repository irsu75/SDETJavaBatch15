package class11;

public class Task6 {
    /*
    Create 20 array of countries:north america countries, europe countries, asian countries,african countries.
    Then print all values from that array using 2 different loop and calculate how many total countries been stored.
     */

    public static void main(String[] args) {
        String[][] countries={{"USA","Canada","Mexico"},
                {"Brazil","Argentina","Peru","Colombia","Chile"},
                {"Germany","United Kingdom","France","Spain"},
                {"China","India","Japan","Russia"},
                {"Egypt", "Nigeria","South Africa","Ethiopia"}
    };

        System.out.println(countries[3].length);

        int counter=0;
        for(int i=0; i<countries.length; i++){
            for (int j = 0;j < countries[i].length; j++) {
                System.out.println(countries[i][j] + " ");
                counter++;
            }

                System.out.println();

            }
            System.out.println("Total countries "+counter);
        }
}
