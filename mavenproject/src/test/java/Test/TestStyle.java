package Test;

import Setup.*;
import org.testng.annotations.*;
import Setup.Excel;
import Setup.WriteExcel;
import Utilities.ScreenShot;
import Utilities.Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Check.*;

@SuppressWarnings("unused")
public class TestStyle {
	
	public static WebDriver d ;
	static Insert insert;
	static Analyze analyze;
	static ScreenShot screenshot;
	private static int y=0;
	
	public TestStyle(WebDriver driver) {
		TestStyle.d = driver;
		
	}

	
	public static void Test(int row) throws Exception {
		//WebDriver d = DriverSetup.getDriver();
		Double arr[] = new Double[4];
		
		String time2 = Utils.getTime();
		
		arr = Excel.readData(Utils.getBook(),Utils.getSheet(),row);
		String aa = Double. toString(arr[0]);
		String bb = Double. toString(arr[1]);
		String cc = Double. toString(arr[2]);
		int val = (int) (arr[3]*1);
		String tst = Integer. toString(val);
		
		Insert.carLoanBtn();
		Insert.carLoanBtn();
		Insert.setLoan(aa);
		Insert.setRate(bb);
		Insert.setTime(cc);
		Insert.press();
		String loc = Utils.getLocation();
		String time = Utils.getTime();
		Insert.press();
		Insert.press();
		String ss = loc+"Test"+row+"_"+time+".png";
		WebElement ele = Analyze.getss();
	
		String interst = Analyze.getInterst();
		String emi = Analyze.getEMI(d, ss, tst);
		
		
		System.out.println("Data from excel"+aa+" "+bb+" "+cc);
		System.out.println("Data from website"+emi+" "+interst);
		
		
		 System.out.println("TestCase"+row);
		 
		
		emi= emi.replaceAll(",", "");
		interst= interst.replaceAll(",", "");
		String res = "kartik";
		 if(emi.equals(tst)) {
		    	System.out.println("PASS");
		    	res = "PASS";
		    }
		    else {
		    	System.out.println("FAIL");
		    	res = "FAIL";
		    }
		 	 
		 System.out.println(ss);
		 System.out.println("start"+time2);
		 System.out.println("end"+time);
		 
		 
		 WriteExcel.writeData(Utils.getBook(),Utils.getSheet(),row,res,emi,interst);
		 //d.quit();
	}
	
}