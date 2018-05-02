package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest5 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("Rachel");
		driver.findElement(By.id("last_name")).sendKeys("Naidu");
		

	}

}
