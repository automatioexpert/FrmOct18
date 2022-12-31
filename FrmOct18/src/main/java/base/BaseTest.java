package base;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import Report.ExtentManager;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
	//	ExtentManager.initReports();
	
	}

	@AfterSuite
	public void afterSuite() throws IOException {
	//	ExtentManager.flushReports();
	}
}
