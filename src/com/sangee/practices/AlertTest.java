package com.sangee.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
     driver.findElement(By.id("searchBtn")).click();
     
     Alert alt=driver.switchTo().alert();
     //get text present on that alert
     System.out.println(alt.getText());
     alt.accept();//click on ok
     //alt.dismiss();//click on close
     //promt alert enter data
     //alt.sendkeys(sangeetha);
	}

}
