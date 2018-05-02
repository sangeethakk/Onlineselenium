package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest3 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement religion=driver.findElement(By.id("ddlReligion"));
		List<WebElement> religionList=religion.findElements(By.tagName("option"));
		System.out.println(religionList.size());
		for (int i = 0; i < religionList.size(); i++)
		{
			religionList.get(i).click();
			if (religionList.get(i).isSelected()) 
			{
				System.out.println(religionList.get(i).getText()+" :  isSelected()");
			}else
				System.out.println(religionList.get(i).getText()+" :  is not Selected()");
		}

	}

}
