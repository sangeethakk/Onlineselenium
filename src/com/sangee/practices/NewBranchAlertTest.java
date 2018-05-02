package com.sangee.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewBranchAlertTest 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		driver.manage().window().maximize();
     driver.findElement(By.xpath(".//*[@id='btn_insert']")).click();
     
     Alert alt=driver.switchTo().alert();
     //get text present on that alert
     System.out.println(alt.getText());
     alt.accept();//click on ok
     //alt.dismiss();//click on close
     //promt alert enter data
     //alt.sendkeys(sangeetha);
	}

}
