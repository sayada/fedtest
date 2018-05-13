package com.usa.loginfuntiontest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class Upslogingfuntiontest {
 
 @Test
	public void getsalary() {
		
		System.setProperty("webdriver.Chrome.driver", "./Driver/IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open firefox browser 
		//WebDriver driver = new FirefoxDriver ();
		
		//how to send URL
	
		
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");
		
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
		
		driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		
		//driver.close();
		driver.quit();
		System.out.println("test pass");
	}
	
	
	
} 
