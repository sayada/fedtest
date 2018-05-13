package com.usa.Stepdefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GmailLogInFuntion2 {
	WebDriver driver;
	@Given("^user be able to open the browser$")
	public void user_be_able_to_open_the_browser() throws Throwable {
		
	    System.setProperty("webdrive.chrome.driver","./Driver/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	}
	
	@Given("^go to Gmail home page$")
	public void go_to_Gmail_home_page() throws Throwable {
		driver.get("https://www.google.com/gmail/about/");
	    
	}

	@When("^user navigate to signin button link$")
	public void user_navigate_to_signin_button_link() throws Throwable {
	   
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
	}

	@When("^user able to put valid email- akhtar\\.sayada@gmail\\.com$")
	public void user_able_to_put_valid_email_akhtar_sayada_gmail_com() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("akhtar.sayada@gmail.com");
	
	}

	@When("^use able to click next$")
	public void use_able_to_click_next() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	    
	}

	@When("^user able to put valid passwords- Jahanara(\\d+)$")
	public void user_able_to_put_valid_passwords_Jahanara(int arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Jahanara2016");
	    
	}

	@When("^user able to click next$")
	public void user_able_to_click_next() throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	}


	
	
}
