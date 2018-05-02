package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		//capturing header by using class name and stored in variable
 WebElement header=driver.findElement(By.className("sw_tb"));
 //capturing multiple links under header by using tagname
 List<WebElement> headerLinks=header.findElements(By.tagName("a"));
 System.out.println(headerLinks.size());
 for (int i = 0; i < headerLinks.size(); i++) 
 {
	 //System.out.println(headerLinks.get(i).getText());
 if (!headerLinks.get(i).getText().isEmpty())
	 
{
	System.out.println(headerLinks.get(i).getText());
}
 }
	 }	 
 }
 
	


