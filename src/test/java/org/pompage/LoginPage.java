package org.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement EmailId;

	public LoginPage(WebDriver driver2) {
		LoginPage.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public void setEmailId(WebElement emailId) {
		EmailId = emailId;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Login;
}



