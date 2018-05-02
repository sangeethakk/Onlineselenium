package com.sangee.practices;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) 
	{
		//Launching FF Browser
	   FirefoxDriver driver=new FirefoxDriver();
	   //Navigate to Gmail
	   driver.get("Http://Gmail.com");

	}

}
