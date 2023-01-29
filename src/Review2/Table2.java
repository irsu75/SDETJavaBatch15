package Review2;

public class Table2 {
    public static void main(String[] args) {

        int a = 7;
        int b = 15;
        int c = 9;
        int d = 20;

        String line = "\t__________________________________________________________________________________________\n";
        String vline = "\t|\t";
        String endline = "\t|";
        String tab = "\t";
        System.out.println(
                line
                        + vline + tab
                        + vline + "+5"
                        + vline + "-10"
                        + vline + "*30"
                        + vline + "/4"
                        + vline + "%6"
                        + vline + "^4"
                        + vline + "++"
                        + vline + "--"
                        + endline
        );
        System.out.println(
                line
                        + vline + "a =" + a
                        + vline + (a + 5)
                        + vline + (a - 10)
                        + vline + (a * 30)
                        + vline + (a / 4)
                        + vline + (a % 6)
                        + vline + (a ^ 4)
                        + vline + (a * a++)
                        + vline + (a--)
                        + endline
        );
        a--;
        System.out.println(vline + a + endline);


    }

    }

