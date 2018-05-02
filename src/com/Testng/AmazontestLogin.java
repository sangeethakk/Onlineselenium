package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazontestLogin 
{
	public FirefoxDriver driver;
	
@BeforeTest
public void appLaunch()
{
	driver=new FirefoxDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
}
@Test
public void appLogin()
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
	driver.findElement(By.className("nav-input")).click();
}
@AfterTest
public void appclose()
{
	driver.close();
}
}

