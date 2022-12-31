package rough;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	@Test
	public void test1() throws IOException {

		// setup
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Report 10PMIST");
		spark.config().setReportName("Automation report for Armada");

		// Create test
		ExtentTest test = extent.createTest("First test case");
		test.pass("Checking the logs");

		ExtentTest test2 = extent.createTest("second test case");
		test.pass("Checking the logs in 2nd test case");

		// tearDown
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());

		// Open the file in the desktop default browser

	}

}
