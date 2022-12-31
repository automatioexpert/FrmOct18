package commonHelper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper {
	private WebDriver driver;
	
	public Alert getAlert() {
		return driver.switchTo().alert();
	}

	public void acceptAlert() {
		getAlert().accept();

	}

	public void dismissAlert() {
		getAlert().dismiss();

	}
	
	public String getAlertText() {
		return getAlert().getText();
	}

}
