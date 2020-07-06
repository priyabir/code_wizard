package Check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Insert {
	public static WebDriver d;
	
	public Insert(WebDriver driver) {
		Insert.d = driver;
	}
	
	public static void setLoan(String loan) {
		WebElement l = d.findElement(By.id("loanamount"));
		l.sendKeys(Keys.CONTROL + "a");
		l.sendKeys(Keys.DELETE);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("loanamount")).sendKeys(loan);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("emicalculatordashboard")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
	
	public static void setRate(String rate) {
		WebElement in = d.findElement(By.id("loaninterest"));
		in.sendKeys(Keys.CONTROL + "a");
		in.sendKeys(Keys.DELETE);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("loaninterest")).sendKeys(rate);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("emicalculatordashboard")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
	
	public static void setTime(String time) {
	WebElement t = d.findElement(By.id("loanterm"));
		t.sendKeys(Keys.CONTROL + "a");
		t.sendKeys(Keys.DELETE);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		d.findElement(By.id("loanterm")).sendKeys(time);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		t.sendKeys(Keys.ENTER);
		}
	
	public static void press() {
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("emicalculatorinnerformwrapper")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public static void carLoanBtn() {
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("car-loan")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	

}