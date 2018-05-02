package com.sangee.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ShadicomRadioButtonsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement buttons=driver.findElement(By.xpath(".//*[@id='reg_home_frm']/div[2]/div/label[1]"));
		List<WebElement> checklist=buttons.findElements(By.tagName("label"));
		System.out.println(checklist.size());
		for (int i = 0; i < checklist.size(); i++)
		{
		//System.out.println(checklist.get(i).getAttribute("checked")+"----"+checlist.get(i).getAttribute("label"));	
		checklist.get(i).click();
		if (checklist.get(i).getAttribute("label").equals("Bride"))
		{
			checklist.get(i).click();
		}
		}
		

	}

}
