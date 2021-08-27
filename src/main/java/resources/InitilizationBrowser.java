package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitilizationBrowser {
	public WebDriver driver;

	public WebDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Kalluri\\10.03.21\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}