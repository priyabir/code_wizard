package Utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

@SuppressWarnings("unused")
public class ScreenShot {
	public WebDriver d;
	
	public ScreenShot(WebDriver driver) {
		this.d = driver;
		
	}
	
	public static void takeSnapShot(WebDriver driver,String fileWithPath, WebElement ele) throws Exception{

		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);             
		  try {                 
		  ImageIO.write(screenshot.getImage(),"PNG",new File(fileWithPath));             
		} catch (IOException e) {                 // TODO Auto-generated catch block                 
		  e.printStackTrace();            
		  }                          
	}
}