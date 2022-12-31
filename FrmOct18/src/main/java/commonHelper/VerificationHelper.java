package commonHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationHelper {

	private WebDriver driver;

	public VerificationHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		}
		catch (Exception e) {
			
			return false;
			
		}
	}
	
	public boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return false;
		}
		catch (Exception e) {
			
			return true;
			
		}
	}
	
	public String getText(WebElement element) {
		if(element==null) {
			
			return null;
		}
		boolean status=isDisplayed(element);
		if(status) {
			return element.getText();
		}
		else {
			return null;
		}
	}
}
