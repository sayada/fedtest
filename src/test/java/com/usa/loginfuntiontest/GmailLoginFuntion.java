package com.usa.loginfuntiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginFuntion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("akhtar.sayada@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Jahanara2016");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	}
}