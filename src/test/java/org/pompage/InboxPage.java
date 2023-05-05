package org.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {

	public static WebDriver driver;

	public InboxPage(WebDriver driver2) {
		HomePage.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getTypemessage() {
		return typemessage;
	}

	public void setTypemessage(WebElement typemessage) {
		this.typemessage = typemessage;
	}

	public WebElement getSentmessage() {
		return sentmessage;
	}

	public void setSentmessage(WebElement sentmessage) {
		this.sentmessage = sentmessage;
	}

	@FindBy(xpath = "(//div[@dir='auto'])[2]")
	private WebElement typemessage;
	@FindBy(xpath = "(//div[@class='svg-icon'])[2]")
	private WebElement sentmessage;
	@FindBy(xpath = "(//li[@class='ant-dropdown-menu-item'])[2]")
	private WebElement sent;

	public WebElement getSent() {
		return sent;
	}

	public void setSent(WebElement sent) {
		this.sent = sent;
	}

	@FindBy(xpath = "//div[@class='rich-text ql-editor']//following::p")
	private WebElement user1txt;;
}
