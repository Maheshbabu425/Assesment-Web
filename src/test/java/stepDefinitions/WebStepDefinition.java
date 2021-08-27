package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.AddUserPage;
import pageObjects.LandingPage;
import resources.InitilizationBrowser;

@RunWith(Cucumber.class)
public class WebStepDefinition extends InitilizationBrowser {

	List<WebElement> users = driver.findElements(By.xpath("//tr[@class='smart-table-data-row ng-scope']"));
	int i = 0;

	@Given("^navigate to ABSA assesment link$")
	public void navigate_to_absa_assesment_link() throws Throwable {
		driver = getBrowser();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
	}

	@When("^give the user details of (.+), (.+), (.+), (.+), coustmer, role, (.+), (.+) and click on save button$")
	public void give_the_user_details_of_coustmer_role_and_click_on_save_button(String firstname, String lastname,
			String username, String password, String email, String cellphone) throws Throwable {
		AddUserPage aup = new AddUserPage(driver);
		aup.getFirstName().sendKeys(firstname);
		aup.getLastName().sendKeys(lastname);
		aup.getUserName().sendKeys(username);
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
		while (i < users.size()) {
			if (users.get(i).getText().equalsIgnoreCase(username)) {
				System.out.println("Username already existed, Try with another username");
				i++;
			} else {
				aup.getSave().click();
			}
		}
	}

	@Then("^verify users added to the table$")
	public void verify_users_added_to_the_table() throws Throwable {
		List<WebElement> usersAfter = driver.findElements(By.xpath("//tr[@class='smart-table-data-row ng-scope']"));
		for (int j = 0; j < usersAfter.size(); j++) {
			if (usersAfter.get(j).getSize() != users.get(i).getSize())
				System.out.println("User added successfully");
		}
	}

	@And("^verify that you are on the user list table$")
	public void verify_that_you_are_on_the_user_list_table() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		// Assert.assertTrue(lp.getTableCloumn().isDisplayed());
		// Assert.assertTrue(lp.getAddUser().isDisplayed());
		if (lp.getAddUser().isDisplayed()) {
			System.out.println("Welcome to user list table");
		}
	}

	@And("^click on add user button$")
	public void click_on_add_user_button() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getAddUser().click();

	}
}
