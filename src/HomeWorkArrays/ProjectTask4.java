package HomeWorkArrays;

public class ProjectTask4 {
    public static void main(String[] args) {
        /*4) Create a 2D array or integer type where you will store odd and even numbers.
             Develop a program which will identify/print the even numbers only.
         */
        int [] []array= {{3,8,6,1,7,2},{17,12,11,19}, {31,44,75,99,58}};
         for( int i = 0; i < array.length; i++){
             for (int j = 0; j <array[i].length; j++){
                 if(array[i] [j]%2==0){
                     System.out.println(array[i][j]);
                 }
             }
         }
    }
}
