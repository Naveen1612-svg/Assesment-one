package org.pompage;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfile {
	public static WebDriver driver;

	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement Viewprofile;
	@FindBy(xpath = "//button[@class='ant-btn btn-link preview-user-sider__profile-link undefined']")
	private WebElement userprofile;
	@FindBy(xpath = "(//span[@aria-label='turn on admin view'])[1]")
	private WebElement AdminView;
	@FindBy(xpath = "//button[@aria-label='Login as user Bob']")
	private WebElement loginas;

	public UserProfile(WebDriver driver2) {
		UserProfile.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getViewprofile() {
		return Viewprofile;
	}

	public void setViewprofile(WebElement viewprofile) {
		Viewprofile = viewprofile;
	}

	public WebElement getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(WebElement userprofile) {
		this.userprofile = userprofile;
	}

	public WebElement getAdminView() {
		return AdminView;
	}

	public void setAdminView(WebElement adminView) {
		AdminView = adminView;
	}

	public WebElement getLoginas() {
		return loginas;
	}

	public void setLoginas(WebElement loginas) {
		this.loginas = loginas;
	}

	public WebElement getInbox() {
		return Inbox;
	}

	public void setInbox(WebElement inbox) {
		Inbox = inbox;
	}

	@FindBy(xpath = "//button[@aria-label='Inbox']")
	private WebElement Inbox;

}