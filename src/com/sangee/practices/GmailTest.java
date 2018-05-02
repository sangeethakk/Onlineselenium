package com.sangee.practices;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest 
{

	public static void main(String[] args)
	{
		String expTitle="Gmail - Free Storage and Email from Google";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		//className
		driver.findElement(By.className("gb_P")).click();
		String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle)) 
		{
			System.out.println("Link is working");
			
		}else
		{
			System.out.println("Link is Not working");
		}

}
}