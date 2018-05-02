package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1 {

	public static void main(String[] args)
	{
	FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		//capture multiple links by tagname and stored into links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		{ 
		System.out.println(links.size());
	}
		//get the text of each and every link
		for (int i = 0; i < links.size(); i++) 
			
		{
			System.out.println(links.get(i).getText());
		}

}
}