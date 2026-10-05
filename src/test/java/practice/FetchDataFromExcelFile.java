package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream
//				("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Exceldata.xlxs.xlsx");  //Create a connection to external file
//		Workbook wb = WorkbookFactory.create(fis);         // create an empty object
//        Sheet sh = wb.getSheet("Flower");
//        Row r = sh.getRow(1);
//        Cell c = r.getCell(3);
//        DataFormatter df = new DataFormatter();
//        String value = df.formatCellValue(c);
//        System.out.println(value);
//      String value = c.getStringCellValue();  //Fetch the data
//      System.out.println(value);
		
	ExcelUtility eu = new ExcelUtility();
	String value1 = eu.getDataFromExcel("Animal", 8, 2);
	System.out.println(value1);
	String value2 = eu.getDataFromExcel("Actor", 7, 2);
	System.out.println(value2);
	String value3 = eu.getDataFromExcel("Flower", 2, 1);
	System.out.println(value3);
		
		
	}
}

