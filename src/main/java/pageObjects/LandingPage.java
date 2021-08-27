package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By addUser = By.cssSelector("button[type='add']");
	By table = By.xpath("/html[1]/body[1]/table[1]/thead[1]/tr[3]/th[1]");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getAddUser()
	{
		return driver.findElement(addUser);
	}
	public WebElement getTableCloumn()
	{
		return driver.findElement(table);
	}
}
