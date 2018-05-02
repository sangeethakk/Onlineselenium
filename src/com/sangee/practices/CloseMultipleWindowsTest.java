package com.sangee.practices;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMultipleWindowsTest {


	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
       String parent=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
       for(String child:allwindows)
       {   
		if (!child.equals(parent))
		{	  
			driver.switchTo().window(child);
			driver.close();
       }
			
	}
       
}
	}

