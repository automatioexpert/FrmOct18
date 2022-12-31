package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	private WebDriver driver;

	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "input[placeholder='yyyy-mm-dd']")
	private WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement toDate;

	@FindBy(css = "i.oxd-icon.bi-caret-down-fill.oxd-select-text--arrow")
	private WebElement arrowDown;

	@FindBy(xpath = "//span[contains(text(),'Pending Approval')]")
	private WebElement pendingApproval;

	@FindBy(xpath = "//span[contains(text(),'Scheduled')]")
	private WebElement scheduled;

	public WebElement getFromDate() {

		return fromDate;
	}

	public WebElement toFromDate() {

		return toDate;
	}

	public WebElement arrowDown() {
		return arrowDown;
	}

	public WebElement pendingApproval() {
		return pendingApproval;
	}
	
	public WebElement scheduled() {
		return scheduled;
	}
	
}
