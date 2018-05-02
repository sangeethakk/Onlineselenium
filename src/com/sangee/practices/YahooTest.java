package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest
{
   public static void main(String[] args)
  {
	
		String expTitle="Selenium - Yahoo Search Results";
	
		FirefoxDriver driver=new FirefoxDriver();
	 
	 driver.get("http://www.yahoo.com");
	 
	 driver.manage().window().maximize();
	 
	driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
	
	 driver.findElement(By.id("uh-search-button")).click();
	 String actTitle=driver.getTitle();
	 if(expTitle.equals(actTitle))
	 {
		System.out.println("pass");
		}else
		{
		System.out.println("Fail");
		}
	 
	 }
	 }
