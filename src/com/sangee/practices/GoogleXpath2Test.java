package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleXpath2Test {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='images']")).click();
		
		

	}

}
