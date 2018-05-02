package com.sangee.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
				

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("sangeetha");
		driver.findElement(By.id("lastName")).sendKeys("Testing");
		driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\butterfly.jpg");
		driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		Runtime.getRuntime().exec("C:\\Users\\satish\\Desktop\\fup.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnsave")).click();
}

}
