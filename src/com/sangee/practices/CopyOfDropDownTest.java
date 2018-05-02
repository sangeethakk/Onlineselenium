package com.sangee.practices;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CopyOfDropDownTest {

	private static RemoteWebDriver driver;

	public static void main(String[] args)
	{
		FirefoxDriver drivr=new FirefoxDriver();
	
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		driver.findElement(By.className("nav-input")).click();
		
		

	}

}
