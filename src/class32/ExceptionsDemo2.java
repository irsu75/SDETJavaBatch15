package class32;

import java.io.IOException;
import utils.ExcelReader;
public class ExceptionsDemo2 {

    public static void main(String[] args) {

        //   System.out.println(10/0);
        //   int[] arr={10,20,30};
        //  System.out.println(arr[5]);
        //  String name=null;
        //   System.out.println(name.length());
        //   int[] arr = new int[-5];

     /*   try {
            ExcelReader.read();
        }catch (Exception e)    {
            System.out.println(e);

      */
    }
            static void test() throws IOException{
           try{
            ExcelReader.read();
        }catch (Exception e){
               System.out.println(e);
           }


    }
}
