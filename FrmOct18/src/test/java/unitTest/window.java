package unitTest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com");
		closeAllTabsAndSwitchToMainWindow();
		System.out.println(driver.getTitle());
		System.out.println("TC Passed..Thank God!!");
	}

	public static void closeAllTabsAndSwitchToMainWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainWindow)) {
				driver.close();
			}
		}

		driver.switchTo().window(mainWindow);
	}

}
