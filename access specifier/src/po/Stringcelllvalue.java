package po;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringcelllvalue {
          public static void main(String[]args) throws EncryptedDocumentException, IOException {
        	  FileInputStream file=new FileInputStream("G:\\Book1");
        	  
       String data=WorkbookFactory.create(file).getSheet("Book1").getRow(1).
        	  getCell(2).getStringCellValue();
        	  System.out.println(data);
          }
}
