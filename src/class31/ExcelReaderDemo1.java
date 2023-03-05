package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReaderDemo1 {

    public static void main(String[] args) throws IOException {

        /*
        Location  of file on the computer
         */
        String path="Files/Book1.xlsx";

        //Navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);

        /*
      It's a class that know how to read and write data to an Exel file
         */
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the exel file we need to get the sheet firtst using below method
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");


        Row row=sheet1.getRow(1);
        Cell cell= row.getCell(1);

        /*
        All the number are treated as doubles in Excel
         */

        System.out.println(cell);


    }
}
