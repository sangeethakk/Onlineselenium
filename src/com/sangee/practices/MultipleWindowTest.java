package com.sangee.practices;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
        driver.manage().window().maximize();
        
        String parent=driver.getWindowHandle();
       //System.out.println("parent window id is:"+parent);
        driver.findElement(By.id("loginsubmit")).click();
       Set<String> allwindows=driver.getWindowHandles();
       /*for(String child:allwindows)
       {
     if(!child.equals(parent))
     {
    	 driver.switchTo().window(child);
     driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
	}*/
       ArrayList<String>tabs=new ArrayList<>(allwindows);
       driver.switchTo().window(tabs.get(1));
       driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
       Thread.sleep(2000);
 
}
}
