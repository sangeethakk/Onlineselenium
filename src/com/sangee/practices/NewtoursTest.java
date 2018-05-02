package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewtoursTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElementByName("userName").sendKeys("sangeetha");
		driver.findElementByName("password").sendKeys("mercury");
		driver.findElementByName("login").click();
		

	}

}
