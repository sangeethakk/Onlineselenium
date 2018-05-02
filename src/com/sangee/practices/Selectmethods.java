package com.sangee.practices;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmethods {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select slt=new Select(drop);
		List<WebElement> dropList=slt.getOptions();
		System.out.println(dropList.size());
		for(WebElement element:dropList)
		{
System.out.println(element.getText());
	}
		}
}
