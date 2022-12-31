package utilities;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class SeleniumUtils extends TestBase {

	public static void main(String[] args) {
		Date d = new Date();
		String date = d.toString();
		String str = date.replace(" ", "_").replace(":", "_");

		System.out.println(str);
	}

	public void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		ele.click();
	}

	public void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	
}
