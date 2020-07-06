package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	public static WebDriver driver;
	public static String baseUrl = "https://emicalculator.net/";
	
	public static WebDriver getDriver() {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA BIR\\eclipse-workspace\\mavenproject\\driver\\chromedriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(DriverSetup.baseUrl);
		String baseUrl = "https://emicalculator.net/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		return driver;
}
	}