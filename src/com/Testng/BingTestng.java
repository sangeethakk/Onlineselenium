package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BingTestng 
{
	@Test
	public void BingTest()
	{
		{
			FirefoxDriver driver=new FirefoxDriver();
	      
	      driver.get("http://www.bing.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("scpl1")).click();

		}

	
	      
	      
	      
	      
	      
	      
		
	      
	      
	}

}
