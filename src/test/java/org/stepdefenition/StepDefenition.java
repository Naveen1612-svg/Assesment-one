package org.stepdefenition;

import java.util.List;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pompage.HomePage;
import org.pompage.InboxPage;
import org.pompage.LoginPage;
import org.pompage.UserProfile;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefenition extends Baseclass {

	LoginPage lp = new LoginPage(driver);
	HomePage Hp = new HomePage(driver);
	InboxPage Ip = new InboxPage(driver);
	UserProfile Up = new UserProfile(driver);

	@Given("The user should be in a proper URL")
	public void the_user_should_be_in_a_proper_url() {
		urlLaunch(
				"https://basecopy5.staging.pg-test.com/auth/sign-in?postLoginRedirect=/hub/newhub503949860%20203/home-v3");
		dynamicWait(10);
	}

	@Given("The user should login the application")
	public void the_user_should_login_the_application() throws InterruptedException {

		sendKeys(lp.getEmailId(), "test+7@peoplegrove.com");
		sendKeys(lp.getPassword(), "Testing@123");
		click(lp.getLogin());
		StaticWait(8000);
	}

	@When("To send a message from user1")
	public void to_send_a_message_from_user1() throws InterruptedException {

		movetoelement(Hp.getCareer());
		click(Hp.getJops());
		click(Hp.getUserprofile());
		click(Hp.getConvobutton());
		StaticWait(2000);
		sendKeys(Ip.getTypemessage(), "Total year of experience 3.8");
		click(Ip.getSentmessage());
		click(Ip.getSent());
	}

	@Then("To check the message is listed under the same user")
	public void to_check_the_message_is_listed_under_the_same_user() {
		String a = "";

		List<WebElement> text = driver.findElements(By.xpath("//div[@class='rich-text ql-editor']//following::p"));
		for (int i = text.size() - 1; i >= text.size() - 5; i--) {
			WebElement txt = text.get(i);
			String text2 = txt.getText();
			if (text2.contains("Total")) {
				a = text2;
			}
		}

		Assert.assertEquals("Validating user 1 text", "Total year of experience 3.8", a);
	}

	@Given("The user should navigate to user profile")
	public void the_user_should_navigate_to_user_profile() {
		click(Up.getViewprofile());
		click(Up.getUserprofile());

	}

	@Given("Login as him\\/her")
	public void login_as_him_her() throws InterruptedException {
		click(Up.getAdminView());
		StaticWait(5000);
		click(Up.getLoginas());

	}

	@When("The user should navigate to inbox page")
	public void the_user_should_navigate_to_inbox_page() throws InterruptedException {
		StaticWait(2000);
		click(Up.getInbox());

	}

	@Then("user should verify the msg send by user2")
	public void user_should_verify_the_msg_send_by_user2() {

		String b = "";

		List<WebElement> text = driver.findElements(By.xpath("//div[@class='rich-text ql-editor']//following::p"));
		for (int i = text.size() - 1; i >= text.size() - 2; i--) {
			WebElement txt = text.get(i);
			String text2 = txt.getText();
			if (text2.contains("Total")) {
				b = text2;

			}
		}
		Assert.assertEquals("Validating user 2 text", "Total year of experience 3.8", b);

	}

}
