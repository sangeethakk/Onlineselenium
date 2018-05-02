package com.sangee.practices;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");

	}

}
