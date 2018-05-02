package com.sangee.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest {

	public static void main(String[] args) throws Exception 
	{
		//applaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		driver.manage().window().maximize();
		//applogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//Branchcreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
		driver.findElement(By.id("txtbName")).sendKeys("sangee");
		driver.findElement(By.id("txtAdd1")).sendKeys("Bangalore");
		driver.findElement(By.id("txtZip")).sendKeys("54367");
		
		Select contry=new Select(driver.findElement(By.id("lst_counrtyU")));
		contry.selectByVisibleText("INDIA");
		//wait
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("BANGLORE");
		
		driver.findElement(By.id("btn_insert")).click();
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		alt.accept();
		//validation 
		if(msg.contains("created sucessfully"));
		{
			System.out.println("Branch created sucessfully");
		}
	{	
		if(msg.contains("already exist"));
	}
		{
			System.out.println("Branch creation fail");
		} 
	{	
		if(msg.contains("please fill in"));
		}

		System.out.println("Warning message");
			}
	}


