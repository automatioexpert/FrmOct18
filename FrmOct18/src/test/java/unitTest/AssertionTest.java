package unitTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import commonHelper.AssertionHelper;

public class AssertionTest {
	WebDriver driver;
	
	@Test
	public void assertion() {
	
		AssertionHelper as= new AssertionHelper(driver);
		//as.makeFalse();
		//as.verifyNullObject(null);
		//as.makeFalse();
		//as.verifyTrue(false);
		//as.verifyText("hi", "hii");
		//as.equals("l");
		as.verifyTrue(!true);
		
		
	}

}
