package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadicomTest6 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.shadi.com/");
		driver.manage().window().maximize();
     WebElement drop=driver.findElement(By.id("dob_m"));
     List<WebElement> dropList=drop.findElements(By.tagName("option"));
     System.out.println(dropList.size());
     for (int i = 0; i < args.length; i++) 
     {
		//System.out.println(dropList.get(i).getText());
    	 if (dropList.get(i).getText().equals("jan"))
    	 {
			dropList.get(i).click();
		}
	}

	}

}
