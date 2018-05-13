package com.usa.loginfuntiontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class CheckTesting {
	
	WebDriver driver;
	
@Test
	
public void test() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	System.out.println("This is google");
	
}
	
@Test 
public void test2() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println("This is facebook");
}
@Test

public void test3() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.yahoo.com/");
	System.out.println("This is yahoo");
}
	
@Test (dependsOnMethods = "test")
public void test4() {
	driver.quit();

}
}
