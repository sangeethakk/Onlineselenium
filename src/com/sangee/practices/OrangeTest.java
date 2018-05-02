package com.sangee.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeTest {

	

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("sangeetha");
		driver.findElement(By.id("lastName")).sendKeys("Testing");
		

}
}