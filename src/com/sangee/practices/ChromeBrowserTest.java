package com.sangee.practices;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Facebook.com");
	

	}

}
