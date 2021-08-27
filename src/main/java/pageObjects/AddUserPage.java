package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUserPage {

	public WebDriver driver;

	By firstName = By.cssSelector("input[name='FirstName']");
	By lastName = By.xpath("//input[@name='LastName']");
	By userName = By.cssSelector("input[name='UserName']");
	By password = By.name("Password");
	By companyAAA = By.cssSelector("input[value='15']");
	By companyBBB = By.cssSelector("input[value='16']");
	By role = By.name("RoleId");
	By email = By.name("Email");
	By cellPhone = By.name("Mobilephone");
	By save = By.cssSelector("button[class='btn btn-success']");

	public AddUserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getUserName() {
		return driver.findElement(userName);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getCompanyAAA() {
		return driver.findElement(companyAAA);
	}

	public WebElement getCompanyBBB() {
		return driver.findElement(companyBBB);
	}

	public WebElement getRole() {
		return driver.findElement(role);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getCellPhone() {
		return driver.findElement(cellPhone);
	}
	public WebElement getSave() {
		return driver.findElement(save);
	}

}
