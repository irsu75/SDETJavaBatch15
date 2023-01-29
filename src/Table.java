public class Table {
    public static void main(String[] args) {
        //13
        int k =5;
        int l =10;
        int m =15;


        String line = "\t_________________________________________________________________________________\n";
        String vline = "\t|\t";
        String endline= "\t|";
        String tab = "\t";

        System.out.println(
                line
                + vline + tab
                + vline +"+10"
                + vline + "-5"
                + vline +"*100"
                + vline + "/2"
                + vline + "%2"
                + vline + "^2"
                + vline + "++"
                + vline + "--"
                + endline
        );
        System.out.println(
                line
                + vline + "k = " + k
                + vline + (k + 10)
                + vline + (k - 5)
                + vline + (k * 100) + " "
                + vline + (k / 2)
                + vline + (k % 2)
                + vline + (k * k++)
                + vline + (k--)
                + endline
        );

        k --;
        System.out.println(vline + k + endline);

        k = l;
        System.out.println(
                line
                 + vline + "l = " + l
                 + vline + (k + 10)
                 + vline + (k - 5)
                 + vline + (k * 100)
                 + vline + (k / 2)
                 + vline + ( k% 2)
                 + vline + (k * k++)
                 + vline + (k--)
                 + endline
        );
        k--;
        System.out.println(vline + k + endline);
        k = m;
        System.out.println(
                 line
                 + vline + "m = 15"
                 + vline + (k + 10)
                 + vline + (k - 5)
                 + vline + (k * 100)
                 + vline + (k / 2)
                 + vline + (k % 2)
                 + vline + (k * k++)
                 + vline + (k--)
                 + endline
        );

        k--;

        System.out.println(vline +k + endline);
        System.out.println(line);






    }
}
