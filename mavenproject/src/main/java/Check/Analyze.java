package Check;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import Test.Scroll;
import Utilities.ScreenShot;

@SuppressWarnings("unused")
public class Analyze {
	public static WebDriver d;
	
	public Analyze(WebDriver driver) {
		Analyze.d = driver;
	}
	
	
	
	public static String getEMI(WebDriver driver,String fileWithPath, String test) {
		String EMI = d.findElement(By.cssSelector("#emiamount span")).getText();
		String emi= EMI.replaceAll(",", "");
		System.out.println("file name from other function "+fileWithPath);
		if(test.equals(emi)) {}
		else {
		try {
			ScreenShot.takeSnapShot(d, fileWithPath, d.findElement(By.cssSelector("#emiamount span")));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
		return EMI;
	}
	
	public static String getInterst() {
		String interst = d.findElement(By.cssSelector("#emitotalinterest span")).getText();
		return interst;
	}
	
	public static WebElement getss() {
		WebElement ele = d.findElement(By.cssSelector("#emitotalinterest span"));
		return ele;
	}

}