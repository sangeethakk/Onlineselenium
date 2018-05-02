package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest2 
{

public static void main(String[] args)
	{
	FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		//capture multiple links by tabname and stored into links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
		//click on privacy link
		for (int i = 0; i < links.size(); i++) 
			{
		if(links.get(i).getText().equals("privacy"))
		{
			links.get(i).click();
			break;
	}
		}
	}
}
