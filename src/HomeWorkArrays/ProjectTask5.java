package HomeWorkArrays;

public class ProjectTask5 {
    public static void main(String[] args) {
        /*
5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.

         */
         int [][] arr={{7,5,2,1,7,3},{12,14,13,11},{22,31,36,28,79}};
         int sumEven =0;
         int sumOdd = 0;
         for( int i = 0; i < arr.length; i++){
             for(int j =0; j < arr[i].length; j++){
                 if(arr[i][j] % 2 ==0) {
                     sumEven = sumEven + arr[i][j];
                 }else{
                     sumOdd= sumOdd+arr[i][j];
                 }
             }
         }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
