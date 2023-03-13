package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) throws FileNotFoundException {

     //   String path=null;
     //   FileInputStream fileInputStream=new FileInputStream(path);

        //Example
        String name="abeera";

        if(name.length()<8) {
          //  throw new RuntimeException("This name is not allowed");
            throw new LazyException("Lazy person found");
        }
    }
}
