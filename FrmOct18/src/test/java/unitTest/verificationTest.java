package unitTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonHelper.VerificationHelper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class verificationTest {
	private static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		VerificationHelper verify = new VerificationHelper(driver);
		WebElement input=null;
		try {
			input = driver.findElement(By.cssSelector("button[aria-label='No thanks']"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		System.out.println(verify.isDisplayed(input));
		driver.quit();
		System.out.println("I am the best expert on the Planet!!");
	}

}
