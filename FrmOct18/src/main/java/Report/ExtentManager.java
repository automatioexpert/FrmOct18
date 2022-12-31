	package Report;
	
	import java.io.File;
import java.io.IOException;

import org.selenium.utils.DateUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.DataUtils;
	
	
	public final class ExtentManager {
	public static ExtentReports extent;
	public	static ExtentTest test;
	
	public static ExtentReports getInstance() {
		if(extent==null) {
			
		String date=DateUtils.getCurrentDate();
			
		/*	extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Automation Report 10PMIST");
			spark.config().setReportName("Automation report for Armada"); */
			
			
			extent = new ExtentReports();
			ExtentSparkReporter	spark = new ExtentSparkReporter("ExtentReports/"+date+".html");
			try {
				spark.loadXMLConfig(new File("extent-config.xml"));
			} catch (IOException e) {
				
			}
			
			extent.attachReporter(spark);
			
			
		}
		
		return extent;
	}
	
		
	
	/*
		public static void initReports() {
			// setup
			if(Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Automation Report 10PMIST");
			spark.config().setReportName("Automation report for Armada");
	
		}
		}
		public static void flushReports() throws IOException {
			if(Objects.nonNull(extent)) {
			extent.flush();
			}
			Desktop.getDesktop().browse(new File("index.html").toURI());
	
		}
	
		public static void createTest(String testcaseName) {
			test=extent.createTest(testcaseName);
	
		}
		*/
		
}
