package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.selenium.utils.PropertyUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Report.ExtentManager;
import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	Properties prop = PropertyUtils.propertyLoader("./src/test/resources/properties/config.properties");
	public static ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {

		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase(BrowserType.CHROME.toString())) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			else if (prop.getProperty("browser").equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));

		System.out.println("Browser launched");
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			
			
			driver.quit();
		}

	}
	
	/*
	try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
		   for (Path entry : stream) {
		       File file = entry.toFile();
		       if (file.isFile()) {
		          if (file.length > 1048576) { //size of MB
		             //delete the file
		             file.delete();
		          }
		       }
		   }
		}
	*/
	

}
