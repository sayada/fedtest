/*package com.usas.ignupfuntiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UPSSignUpFuntiontest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://www.ups.com/us/en/Home.page");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ups-full_name_input']")).sendKeys("sayada");
		driver.findElement(By.xpath(".//*[@id='ups-email_input']")).sendKeys("sayadaakhtar@ymail.com");
		driver.findElement(By.xpath(".//*[@id='ups-user_id_input']")).sendKeys("sayada802");
		driver.findElement(By.xpath(".//*[@id='ups-user_password_input']")).sendKeys("123456@sa0");
		driver.findElement(By.xpath(".//*[@id='ups-checkbox_group']/div/label")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath(".//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath(".//*[@id='SignupConfirmationDiv']/div[1]/div/div/div[2]/div[4]/div/button")).sendKeys(Keys.SPACE);
	
		//driver.quit();
		System.out.println("Test Passed");
	}
	

}
*/