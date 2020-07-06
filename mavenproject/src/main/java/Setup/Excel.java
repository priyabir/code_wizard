package Setup;


import java.io.FileInputStream;

//import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {        


	public static Double[] readData(String book,String sheetName,int row) throws Exception {
	   FileInputStream file = new FileInputStream("C:\\Users\\PRIYA BIR\\eclipse-workspace\\mavenproject\\gryff.xlsx");
	  // ZipSecureFile.setMinInflateRatio(0.009);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet(sheetName);
		Double[] arr = new Double[4];
		for(int i=0;i<4;i++){
			arr[i] = sheet.getRow(row).getCell(i).getNumericCellValue();
		}
	//	wb.close();
		return arr;
		
	}
}