package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	private WebElement admin;

	// Add Users
	@FindBy(xpath = "//*[normalize-space()='Add']")
	private WebElement addBtn;

	@FindBy(css = "i.oxd-icon.bi-caret-down-fill.oxd-select-text--arrow")
	private WebElement downArrow;

	@FindBy(css = "div.oxd-select-text-input")
	private WebElement getAdmin;

	@FindBy(css = "input[placeholder='Type for hints...']")
	private WebElement empName;
	
	@FindBy(css="span.oxd-userdropdown-tab")
	private WebElement userDropdown;
	

	@FindBy(css = "a[href*='lo']")
	private WebElement logout;
	
	//Navigate to various tabs:
	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	private WebElement adminLink;
	
	

	public WebElement navigateTabs(String name) {
		return driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]"));
	}

	public WebElement getLogOut() {
		return logout;
	}

	
	public WebElement getUserDropdown() {
		return userDropdown;
	}
}
