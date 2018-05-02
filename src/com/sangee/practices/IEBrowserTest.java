package com.sangee.practices;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.ie.driver","C:\\Users\\satish\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("Http://yahoo.com");

	}

}
