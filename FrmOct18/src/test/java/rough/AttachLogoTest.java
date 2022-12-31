package rough;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachLogoTest {
	
	ExtentReports extent;
	ExtentSparkReporter spark;
	
	@Test
	public void attach() throws IOException {
		
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark2.html");
		spark.loadXMLConfig(new File("extent-config.xml"));
		extent.attachReporter(spark);
		
/*		spark.config().setDocumentTitle("VV Automation Report");
		spark.config().setReportName("Functional Report");
		spark.config().setTheme(Theme.DARK); */
		
		ExtentTest test=extent.createTest("First automation test");
		test.pass("Test stated");
		test.pass("Test finished");
		
		extent.flush();
		
		System.out.println("Test execution completed!!");
		
		
		
	}

}
