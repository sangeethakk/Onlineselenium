package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest {

	private static final int i = 0;

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		Thread.sleep(2000);

		List<WebElement> City=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		
		System.out.println(City.size());
		for (int i = 0; i < City.size(); i++) 
		{	
			System.out.println(City.get(i).getText());
		if (City.get(i).getText().equals("Hubli"))
	{
	 City.get(i).click();
	 break;
	}
		}
	}
}


