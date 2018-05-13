package com.usa.loginfuntiontest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageFactory {

	WebDriver driver;
  
   public HomePageFactory (WebDriver driver) {
	   this.driver=driver;
	   
   }
	
	private String AppURL= "https://www.ups.com/us/en/Home.page";

	private WebElement LoginLinkbtn= driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a"));
	private WebElement userName= driver.findElement(By.xpath(".//*[@id='email']"));
	
	private WebElement password = driver.findElement(By.xpath(".//*[@id='pwd']"));
	private WebElement okbtn = driver.findElement(By.xpath(".//*[@id='submitBtn']"));
	
	
	
	
	public WebElement getLoginLinkbtn() {
		return LoginLinkbtn;
	}




	public WebElement getUserName() {
		return userName;
	}




	public WebElement getPassword() {
		return password;
	}




	public WebElement getOkbtn() {
		return okbtn;
	}




	public String getAppURL() {
		return AppURL;
	}
	
	
	}


	

