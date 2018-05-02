package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleXpathTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		
		

	}

}
