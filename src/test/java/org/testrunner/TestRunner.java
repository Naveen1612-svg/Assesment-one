package org.testrunner;

import org.baseclass.Baseclass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Assesement-one\\src\\test\\java\\BaseCopy.Feature\\BaseCopy.feature", 
glue = "org.stepdefenition", dryRun = false)
public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void browser() {
		driver = Baseclass.launchBrowser("chrome");
		
		
		
		
		

	}

}
