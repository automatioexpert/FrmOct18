package rough;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachScreenshot {
	public class AttachLogoTest {

		ExtentReports extent;
		ExtentSparkReporter spark;
		ExtentTest test;

		WebDriver driver;

		@BeforeSuite
		public void attach() throws IOException {

			extent = new ExtentReports();
			spark = new ExtentSparkReporter("target/Spark2.html");
			spark.loadXMLConfig(new File("extent-config.xml"));
			extent.attachReporter(spark);

			test = extent.createTest("attach test");
			test.pass("Test stated");
			test.pass("Test finished");

			// extent.flush();

			System.out.println("Test execution completed!!");

		}

		@Test
		public void attachScreenshot() throws IOException {
			extent.createTest("attachScreenshot started");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			test.pass("Browser opended with Google");

			driver.findElement(By.name("q")).sendKeys("India");
			test.pass("values entered in Google box",
					MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());

			test.pass("test finished");
			
		//	Desktop.getDesktop().browse(new File(""))
			
		}

		public String getSreenshotPath() throws IOException {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir")+"/Screenshots/image.png";

			FileUtils.copyFile(srcFile, new File(path));
			return path;
		}

		public String getScreenshotAsBase64() throws IOException {
			
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir")+"/Screenshots/image.png";

			FileUtils.copyFile(srcFile, new File(path));
			
			byte[] imageBytes = IOUtils.toByteArray(new FileInputStream(path));
			Base64.getEncoder().encode(imageBytes);
			return Base64.getEncoder().encodeToString(imageBytes);
			
		}
		
		public String getBase64() {
			return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		}
		
		@AfterSuite
		public void tearDown() {
			extent.flush();
			driver.close();
		}

	}

}
