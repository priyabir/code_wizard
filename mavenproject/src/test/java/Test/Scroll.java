package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@SuppressWarnings("unused")
public class Scroll {
	public static WebDriver d;
	public Scroll(WebDriver driver) {
		Scroll.d = driver;
	}
	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("windows.scrollBy(0,500)","");
	}

}