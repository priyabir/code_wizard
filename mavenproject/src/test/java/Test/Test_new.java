package Test;

import Setup.*;
import Check.Insert;
import Check.Analyze;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;



public class Test_new {
	public static WebDriver driver;
	static Insert insert;
	static Analyze analyze;
	static String book = "gryff.xlsx";
	
	static String sheet = "insert"; 
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void setUp() {
		DriverSetup ds=new DriverSetup();
        driver=ds.getDriver();
		insert= new Insert(driver);
		analyze= new Analyze(driver);
	}
	
	
	@Test(priority = 1)
	public static void Testing1() throws NullPointerException {
		try {
			TestStyle.Test(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 2)
	public static void Testing2() throws NullPointerException {
		try {
			TestStyle.Test(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 3)
	public static void Testing3() throws NullPointerException {
		try {
			TestStyle.Test(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 4)
	public static void Testing4() throws NullPointerException {
		try {
			TestStyle.Test(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 5)
	public static void Testing5() throws NullPointerException {
		try {
			TestStyle.Test(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 6)
	public static void Testing6() throws NullPointerException {
		try {
			TestStyle.Test(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 7)
	public static void Testing7() throws NullPointerException {
		try {
			TestStyle.Test(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 8)
	public static void Testing8() throws NullPointerException {
		try {
			TestStyle.Test(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 9)
	public static void Testing9() throws NullPointerException {
		try {
			TestStyle.Test(9);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 10)
	public static void Testing10() throws NullPointerException {
		try {
			TestStyle.Test(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 11)
	public static void Testing11() throws NullPointerException {
		try {
			TestStyle.Test(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 12)
	public static void Testing12() throws NullPointerException {
		try {
			TestStyle.Test(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 13)
	public static void Testing13() throws NullPointerException {
		try {
			TestStyle.Test(13);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 14)
	public static void Testing14() throws NullPointerException {
		try {
			TestStyle.Test(14);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 15)
	public static void Testing15() throws NullPointerException {
		try {
			TestStyle.Test(15);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 16)
	public static void Testing16() throws NullPointerException {
		try {
			TestStyle.Test(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 17)
	public static void Testing17() throws NullPointerException {
		try {
			TestStyle.Test(17);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 18)
	public static void Testing18() throws NullPointerException {
		try {
			TestStyle.Test(18);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 19)
	public static void Testing19() throws NullPointerException {
		try {
			TestStyle.Test(19);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 20)
	public static void Testing20() throws NullPointerException {
		try {
			TestStyle.Test(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
	
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}
}