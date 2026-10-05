package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Exceldata.xlxs.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	//	Cell c = wb.getSheet("Animal").getRow(4).createCell(1);
   //	Cell c = wb.createSheet("Place").createRow(0).createCell(0);
		Cell c = wb.getSheet("Actor").getRow(3).getCell(0);
		c.setCellValue("Anushka");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Exceldata.xlxs.xlsx");
		wb.write(fos);
		
	}

}
