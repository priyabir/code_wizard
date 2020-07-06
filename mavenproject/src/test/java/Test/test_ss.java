package Test;

import java.nio.file.AccessDeniedException;

import org.testng.annotations.Test;

public class test_ss {
	@Test
	public static void take() {
		try {
			BStackTakeSceenshot.testBStackTakeScreenShot();
		} catch (AccessDeniedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
