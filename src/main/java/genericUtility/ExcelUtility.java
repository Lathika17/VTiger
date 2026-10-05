package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a Utility class which deals with Excel file
 * @author Lathu
 * @version 26-09-06
 */

public class ExcelUtility {
	/**
	 * This is a generic method to fetch data from Excel file
	 * @param SheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getDataFromExcel(String SheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(SheetName).getRow(rowIndex).getCell(cellIndex);
	DataFormatter df = new DataFormatter();
	String value = df.formatCellValue(c);
	return value;
	}


	/**
	 * This is a generic method to write data to excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
    public void  writeDataTOExcel(String sheetName, int rowIndex, int cellIndex, String value) throws EncryptedDocumentException, IOException {
    	FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet("Animal").getRow(4).createCell(1);
        c.setCellValue("Anushka");
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
    }
    
    
    
    
    
    
    } 
    