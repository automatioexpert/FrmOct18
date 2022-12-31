package testcases.regression;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Constants.FrameworkConstant;
import base.TestBase;
import pages.HomePage;
import pages.LeavePage;
import pages.LoginPage;

public class LeaveTest extends TestBase {
	LoginPage login;
	HomePage home;
	LeavePage leave;

	@BeforeClass
	public void beforeClass() {

		login = new LoginPage(driver);
		home = new HomePage(driver);
		leave = new LeavePage(driver);

	}

	@Test(priority = 0)
	public void loginTest() {

		login.login(FrameworkConstant.USERNAME, FrameworkConstant.PASSWORD);
		test.log(Status.INFO, "Page title is: " + driver.getTitle());
		System.out.println("loginTest passed");

	}

	@Test(priority = 0)
	public void applyLeaveTest() {
		leave.arrowDown().click();
		

	}

	// ,dependsOnMethods = "loginTest"
	@Test(priority = 1)
	public void logOutTest() {
		/*
		 * //homepage.getLogOut().click(); String login=login.getLoginLabel().getText();
		 * login.getUserDropdown().click(); login.getLogOut().click();
		 * //Assert.assertEquals(login, "Login");
		 * System.out.println("Logout test passed");
		 */

	}

}
