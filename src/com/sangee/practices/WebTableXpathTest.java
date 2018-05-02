package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableXpathTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
				

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
      //rows count
		List<WebElement>rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
	System.out.println(rows.size());
	for (int i = 0; i < rows.size(); i++)
	{
		//column count
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	System.out.println(col.size());
	//rows wise column data
	//for (int j = 0; j < col.size(); j++) 
	//{
	System.out.println(col.get(2).getText());	
	//}
	}
	}

}
