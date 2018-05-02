package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ORHRM
{ 
	public FirefoxDriver driver;

	@BeforeSuite
	public void appLaunch()
	{
		 driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");	
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.id("btnLogin")).isDisplayed());
	}
	
@BeforeTest
public void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
}
@AfterTest
public void appLogout()
{
	driver.findElement(By.id("wellcome")).click();
	driver.findElement(By.linkText("Logout")).click();
}
	@AfterSuite
	public void appClose()
	{
driver.close();
	
	
	
}