package testcases.smoke;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Constants.FrameworkConstant;
import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	public LoginPage loginpage;
	public HomePage homepage;

	@BeforeClass
	public void beforeClass() {

		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);

	}

	@Test(priority = 0)
	public void loginTest() {
		
		loginpage.login(FrameworkConstant.USERNAME, FrameworkConstant.PASSWORD);
		test.log(Status.INFO,"Page title is: "+driver.getTitle());
		System.out.println("loginTest passed");
		
		//Assert.fail();
	}

	//,dependsOnMethods = "loginTest"
	@Test(priority = 1)
	public void logOutTest() {
		
		//homepage.getLogOut().click();
		String login=loginpage.getLoginLabel().getText();
		homepage.getUserDropdown().click();
		homepage.getLogOut().click();
		//Assert.assertEquals(login, "Login");
		System.out.println("Logout test passed");
		
		
	}
	
	@Test(priority = 2)
	public void read() throws InterruptedException {
		
		driver.get("https://www.amazon.com");
	
	}
	
	
	
}
