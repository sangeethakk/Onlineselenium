package com.methods;


import java.io.IOException;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalLibrary 
{
	//Global Variable
	public FirefoxDriver driver;
	public String res;
 public  String applaunch(String url)
 {
 
	 driver=new FirefoxDriver();
	driver.get(url);	
	driver.manage().window().maximize();
	if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
	{
		res="Pass";
	}else
	{
	res="Fail";
}
	return res;
}
 //applogin
   public String appLogin(String userName,String Password)
   {
	   driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("Welcome")).isDisplayed()) 
		{
		res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
   }
    
   //empAdd
  
   public String empAdd(String fname,String lname) throws Exception
   {
   
   driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("fname");
	driver.findElement(By.id("lastName")).sendKeys("lname");
	
	driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\butterfly.jpg");
	driver.findElement(By.xpath(".//*[@id='photofile']")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\satish\\Desktop\\fup.exe");
	Thread.sleep(2000);
	
	driver.findElement(By.id("btnsave")).click();
	if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
	{
	res="Pass";
	}else
	{
   res="Fail";
 }
	return res;
}

	
}
 
 
