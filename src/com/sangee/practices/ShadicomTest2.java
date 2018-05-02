package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest2 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.id("dob_m"));
		List<WebElement> monthList=month.findElements(By.tagName("option"));
		System.out.println(monthList.size());
		for (int i = 0; i < monthList.size(); i++)
		{
			monthList.get(i).click();
			if (monthList.get(i).isSelected()) 
			{
				System.out.println(monthList.get(i).getText()+" :  isSelected()");
			}else
				System.out.println(monthList.get(i).getText()+" :  is not Selected()");
		}

	}

}
