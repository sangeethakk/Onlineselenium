package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeTestLogin
{ 
	public FirefoxDriver driver;

	@BeforeTest
	public void appLaunch()
	{
		 driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");	
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.id("btnLogin")).isDisplayed());
	}
	
@Test
public void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
}
@AfterTest
public void appClose()
{
	driver.close();
}
	
	
	
}