package Setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class WriteExcel {
	public static void writeData(String book,String sheetName,int r,String result,String emi,String interst) throws IOException {
		FileInputStream file = new FileInputStream(book);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh1= wb.getSheet(sheetName);
        FileOutputStream fs = new FileOutputStream(book);
	        
	        
	     
		sh1.getRow(r).getCell(4).setCellValue(result);
		sh1.getRow(r).getCell(5).setCellValue(emi);
		sh1.getRow(r).getCell(6).setCellValue(interst);
	        wb.write(fs);
	        fs.close();
	       // wb.close();


	}}

