package org.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	@FindBy(id = "navlist-ele-1")
	private WebElement Career;
	@FindBy(xpath = "//li[@id='tab-option-0']")
	private WebElement Jops;
	@FindBy(xpath = "//div[@class='contextual-info JOB_TITLE']")
	private WebElement userprofile;
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement Convobutton;

	public HomePage(WebDriver driver2) {

		HomePage.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getCareer() {
		return Career;
	}

	public void setCareer(WebElement career) {
		Career = career;
	}

	public WebElement getJops() {
		return Jops;
	}

	public void setJops(WebElement jops) {
		Jops = jops;
	}

	public WebElement getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(WebElement userprofile) {
		this.userprofile = userprofile;
	}

	public WebElement getConvobutton() {
		return Convobutton;
	}

	public void setConvobutton(WebElement convobutton) {
		Convobutton = convobutton;
	}

}
