package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
	      
	      driver.get("http://www.bing.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("scpl1")).click();
	      

	}

}
