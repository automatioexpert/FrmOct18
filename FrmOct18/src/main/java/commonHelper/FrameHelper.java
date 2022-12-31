package commonHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	private WebDriver driver;

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);

	}

	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);

	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);

	}
	
	

}
