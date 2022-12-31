package commonHelper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptHelper {
	private WebDriver driver;

	public void clickElement(WebElement element) {
		executeScript("arguments[0].click()",element);
	}
	public JavascriptHelper(WebDriver driver) {
		this.driver = driver;
	}

	public Object executeScript(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, args);
	}

	public void scrollToWebElement(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1]", element.getLocation().x, element.getLocation().y);

	}

	public void scrollToElementAndClick(WebElement element) {
		scrollToWebElement(element);
		element.click();
	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);

	}

	public void scrollIntoViewAndClick(WebElement element) {

		executeScript("arguments[0].scrollIntoView", element);
		element.click();

	}

	public void scrollDownVertically() {
		executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

	public void scrollDownByPixel(int pixel) {
		executeScript("window.scrollBy(0,"+pixel+")");
	}
	
	public void scrollUpByPixel(int pixel) {
		executeScript("window.scrollBy(0,-"+pixel+")");
	}
}