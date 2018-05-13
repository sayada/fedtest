package com.usa.loginfuntiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class AppURL {
WebDriver driver; 
	
	@Given("^user able to open the browser$")
	public void user_able_to_open_the_browser() throws Throwable {
		driver = new FirefoxDriver ();
	  
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {
		
		HomePageFactory obj = new HomePageFactory(driver);
		
		driver.get(obj.getAppURL());
		
	
	}
	
}

