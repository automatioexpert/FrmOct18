package unitTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonHelper.JavascriptHelper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class jsTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.cssSelector("div[class=\"FPdoLc lJ9FBc\"] input[name=\"btnI\"]"));

		JavascriptHelper js = new JavascriptHelper(driver);
		js.clickElement(ele);

		js.clickElement(driver.findElement(By.cssSelector("a[href*='doodles']")));
		js.clickElement(driver.findElement(By.cssSelector("a[href*='about']")));
		
		System.out.println("Clicked on webelement..!!");
		driver.quit();

	}

}
