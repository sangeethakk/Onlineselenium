package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement year=driver.findElement(By.id("dob_y"));
		List<WebElement> yearList=year.findElements(By.tagName("option"));
		System.out.println(yearList.size());
		for (int i = 0; i < yearList.size(); i++)
		{
			yearList.get(i).click();
			if (yearList.get(i).isSelected()) 
			{
				System.out.println(yearList.get(i).getText()+" :  isSelected()");
			}else
				System.out.println(yearList.get(i).getText()+" :  is not Selected()");
		}

	}

}
