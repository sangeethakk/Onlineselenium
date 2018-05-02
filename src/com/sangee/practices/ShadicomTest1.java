package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest1 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.id("dob_m"));
		List<WebElement> dayList=day.findElements(By.tagName("option"));
		System.out.println(dayList.size());
		for (int i = 0; i < dayList.size(); i++)
		{
			dayList.get(i).click();
			if (dayList.get(i).isSelected()) 
			{
				System.out.println(dayList.get(i).getText()+" :  isSelected()");
			}else
				System.out.println(dayList.get(i).getText()+" :  is not Selected()");
		}

	}

}
