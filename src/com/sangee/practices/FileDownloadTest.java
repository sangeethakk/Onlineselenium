package com.sangee.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Runtime.getRuntime().exec("C:\\Users\\satish\\Desktop\\fdp.exe");

	}

}
