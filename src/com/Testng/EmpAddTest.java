package com.Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpAddTest extends ORHRM

{
	@Test
	public void empAdd() throws Exception
	{
	 driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Avi123");
		driver.findElement(By.id("lastName")).sendKeys("Salesforce");
		
		//driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\butterfly.jpg");
		//driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		
		//Runtime.getRuntime().exec("C:\\Users\\satish\\Desktop\\fup.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnsave")).click();
}
}
