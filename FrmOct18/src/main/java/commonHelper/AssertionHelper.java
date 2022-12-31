package commonHelper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionHelper {
	private WebDriver driver;

	public AssertionHelper(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyText(String s1, String s2) {
		Assert.assertEquals(s1, s2);

	}

	public void makeTrue() {
		Assert.assertTrue(true);
	}

	public void makeTrue(String message) {
		Assert.assertTrue(true, message);

	}

	public void makeFalse() {
		Assert.assertTrue(false);
	}

	public void makeFalse(String message) {
		Assert.assertTrue(false, message);

	}

	public void verifyTrue(boolean status) {

		Assert.assertTrue(status);
	}

	public void verifyFalse(boolean status) {
		Assert.assertFalse(status);

	}
	
	public void verifyNullObject(String s1) {
		Assert.assertNull(s1);
	}
	
	public void verifyNotNullObject(String s1) {
		Assert.assertNotNull(s1);
	}

	

}
