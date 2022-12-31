package rough;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {

	ExtentReports extent;
	ExtentSparkReporter spark;
	@Test
	public void beforeClass() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");

		spark.config().setDocumentTitle("VV Automation Report");
		spark.config().setReportName("Functional Report");
		spark.config().setTheme(Theme.DARK);
		
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Automation Engineer", "Valmiki Vishwakarma");
	 	extent.setSystemInfo("Build", "19.2.103");
		
		
	}

	@Test
	public void loginTest() {
	
		
		
		ExtentTest test = extent.createTest("MyFirstTest");
		test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");

		test.log(Status.INFO, "Executing DB test");
		test.log(Status.FAIL, "Executing Login test failed");
		test.log(Status.SKIP, "Skipping this test as data is not ready");
		test.log(Status.INFO, "Executing Delete test");
		test.log(Status.WARNING, "Executing Upload test");

		System.out.println("Extent report is generated!!");

	}

	@Test(priority = 1)
	public void logoutTest() {
		ExtentTest test = extent.createTest("logoutTest");
		test.log(Status.PASS, "logoutTest vv test passed.");

	}

	@Test(priority = 2)
	public void logDeleteTest() {
		ExtentTest test = extent.createTest("logDeleteTest");
		test.log(Status.PASS, "logDeleteTest vv test passed.");

	}

	@AfterClass
	public void afterClass() {
		extent.flush();

	}
}
