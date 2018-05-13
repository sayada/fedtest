/*package com.usa.signupfuntiontest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UspSignUpFuntionTest {
	WebDriver driver;
	

	@Given("^go to www\\.ups\\.com$")
	public void go_to_www_ups_com() throws Throwable {
		driver.get("https://www.ups.com/us/en/Home.page");
	    
	}

	@When("^user navigate to signup link$")
	public void user_navigate_to_signup_link() throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[2]/")).click();
	}

	@When("^user able to type name- sayada$")
	public void user_able_to_type_name_sayada() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='ups-full_name_input']")).sendKeys("sayada");
	    
	}

	@When("^user able to type valid email- sayadaakhtar@ymail\\.com$")
	public void user_able_to_type_valid_email_sayadaakhtar_ymail_com() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='ups-email_input']")).sendKeys("sayadaakhtar@ymail.com");
	    
	}

	@When("^user able to type user id- sayada(\\d+)$")
	public void user_able_to_type_user_id_sayada(int arg1) throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='ups-user_id_input']")).sendKeys("sayada20");
	}

	@When("^user able to type valid passwords- (\\d+)saa$")
	public void user_able_to_type_valid_passwords_saa(int arg1) throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='ups-user_password_input']")).sendKeys("123456@sa0");
	}

	@When("^user able to Navigate to check box link$")
	public void user_able_to_Navigate_to_check_box_link() throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='ups-checkbox_group']/div/label")).sendKeys(Keys.SPACE);
	}

	@When("^user able to click the signup button$")
	public void user_able_to_click_the_signup_button() throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button")).sendKeys(Keys.SPACE);
	}

	@Then("^user should signup successfuly$")
	public void user_should_signup_successfuly() throws Throwable {
	
		driver.findElement(By.xpath(".//*[@id='SignupConfirmationDiv']/div[1]/div/div/div[2]/div[4]/div/button")).sendKeys(Keys.SPACE);
	}



}
*/