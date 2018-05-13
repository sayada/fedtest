package com.usa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowseTest {

 static WebDriver driver;
	
 @Test
 @Parameters("browser")
 
	public void getbrowser() {
		
		String fx="firefox";
		String chr= "chrome";
		String ie= "ie";
		
		
		
		if (fx.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver(); 
		driver.get("https://www.google.com");
		System.out.println("firefox closed");
		}
		
	    if (chr.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("chrome closer");
		}
		
		
	    if (ie.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver","./Driver/IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
		System.out.println("ie closed");
		}

	}
	
	
}

