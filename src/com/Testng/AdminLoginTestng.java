package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTestng 
{
@Test
public void AdminLoginTestng()
{
	
FirefoxDriver driver=new FirefoxDriver();
driver.get("Http://PrimusBank.qedgetech.com");
driver.manage().window().maximize();
 {
	Assert.assertTrue(driver.findElement(By.id("login")).isDisplayed());
 }
}



}
