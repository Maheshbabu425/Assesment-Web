package runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.AddUserPage;
import pageObjects.LandingPage;
import resources.InitilizationBrowser;

@Test
public class TestNG extends InitilizationBrowser {

	@Test(dataProvider = "getData")
	public void testRunner(String firstname, String lastname, String username, String password, String email,
			String cellphone) {

		driver = getBrowser();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");

		LandingPage lp = new LandingPage(driver);
		if (lp.getAddUser().isDisplayed()) {
			System.out.println("Welcome to user list table");

			lp.getAddUser().click();

			AddUserPage aup = new AddUserPage(driver);
			aup.getFirstName().sendKeys(firstname);
			aup.getLastName().sendKeys(lastname);

			List<WebElement> rows = driver.findElements(By.xpath("//tr[@ng-repeat='dataRow in displayedCollection']"));
			for (int i = 0; i < rows.size(); i++) {
				String user = driver.findElement(By.xpath("//td[@class='smart-table-data-cell'][2]")).getText();
				{
					if (user.equalsIgnoreCase(username)) {
						System.out.println("User already existed");
					} else {
						aup.getUserName().sendKeys(username);
					}
				}
			}

			aup.getPassword().sendKeys(password);

			if (aup.getUserName().getText().equalsIgnoreCase("User1")) {
				aup.getCompanyAAA().click();
			} else {
				aup.getCompanyBBB().click();
			}
			Select dropdown = new Select(aup.getRole());

			if (aup.getUserName().getText().equalsIgnoreCase("User1")) {
				dropdown.selectByVisibleText("Admin");
			} else if (aup.getUserName().getText().equalsIgnoreCase("User2")) {
				dropdown.selectByVisibleText("Customer");
			} else {
				dropdown.selectByIndex(0);
			}

			aup.getEmail().sendKeys(email);
			aup.getCellPhone().sendKeys(cellphone);
			aup.getSave().click();

			/*
			 * while (i < users.size()) { if
			 * (users.get(i).getText().equalsIgnoreCase("User1")) {
			 * System.out.println("Username already existed, Try with another username");
			 * i++; } else { aup.getSave().click(); } }
			 */
		}
	}

	@DataProvider()
	public Object[][] getData() {
		Object[][] details = new Object[2][6];
		details[0][0] = "FName1";
		details[0][1] = "LName1";
		details[0][2] = "User1";
		details[0][3] = "Pass1";
		details[0][4] = "admin@mail.com";
		details[0][5] = "082555";
		details[1][0] = "FName2";
		details[1][1] = "LName2";
		details[1][2] = "User2";
		details[1][3] = "Pass2";
		details[1][4] = "cusomter@mail.com";
		details[1][5] = "083444";
		return details;

	}

	{

	}

}