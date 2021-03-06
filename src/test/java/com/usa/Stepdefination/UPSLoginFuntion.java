package com.usa.Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.usa.loginfuntiontest.HomePageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSLoginFuntion extends HomePageFactory {
	
	public UPSLoginFuntion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

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

	@When("^user navigate to login button link$")
	public void user_navigate_to_login_button_link() throws Throwable {
	    
		driver.findElement(By.xpath(".//a[text()='Log In']")).click();
	}

	@When("^user able to put valid user name- Sarower(\\d+)$")
	public void user_able_to_put_valid_user_name_Sarower(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");
	}

	@When("^user able to put valid passwords- Ttch(\\d+)\\$$")
	public void user_able_to_put_valid_passwords_Ttch_$(int arg1) throws Throwable {
	    
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
	}

	@Then("^Login Successful$")
	public void login_Successful() throws Throwable {
	    System.out.println("Test Pass");
	    driver.quit ();
	    
	}


}
