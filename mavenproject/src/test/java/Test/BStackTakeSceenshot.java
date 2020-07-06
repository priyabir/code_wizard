package Test;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.nio.file.AccessDeniedException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class BStackTakeSceenshot {
@Test
public static void testBStackTakeScreenShot() throws AccessDeniedException{

WebDriver driver ;
System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA BIR\\eclipse-workspace\\mavenproject\\driver\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
//goto url
driver.get("https://www.browserstack.com");
//Call take screenshot function
//String s = "new_ss";
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
LocalDateTime now = LocalDateTime.now();  
String time = (dtf.format(now));
time = time.replaceAll("/", "_");
time = time.replaceAll(":", "_");
System.out.println(dtf.format(now));
//scan.close();
try {
	takeSnapShot(driver, "D:\\"+time+".png") ;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
}
/**
* This function will take screenshot
* @param webdriver
* @param fileWithPath
* @throws Exception
*/
public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
File DestFile=new File(fileWithPath);
//Copy file at destination
//Files.copy(SrcFile.toPath(), DestFile.toPath());
FileUtils.copyFile(SrcFile, DestFile);
//Files.copy(SrcFile, DestFile);
}
}