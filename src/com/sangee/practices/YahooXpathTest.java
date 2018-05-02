package com.sangee.practices;

import org.openqa.jetty.html.Composite;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YahooXpathTest 
{


	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[starts-with(@id,='yui_3_18_0_3_15')]/span"));
		
		System.out.println(list.size());
		list.get(2).click();
		
		
	}

}
