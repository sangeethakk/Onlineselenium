package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest4 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.id("ddlCountry"));
		List<WebElement> countryList=country.findElements(By.tagName("option"));
		System.out.println(countryList.size());
		for (int i = 0; i < countryList.size(); i++)
		{
			countryList.get(i).click();
			if (countryList.get(i).isSelected()) 
			{
				System.out.println(countryList.get(i).getText()+" :  isSelected()");
			}else
				System.out.println(countryList.get(i).getText()+" :  is not Selected()");
		}

	}

}
