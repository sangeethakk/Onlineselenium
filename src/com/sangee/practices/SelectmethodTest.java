package com.sangee.practices;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectmethodTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select slt=new Select(drop);
	//slt.selectByIndex(36);
	//slt.selectByVisibleText("Collectibles & Fine Art");
		//slt.selectByValue("search-alias=baby-products");
	//System.out.println(slt.isMultiple());
		//System.out.println(slt.getFirstSelectedOption().getText());
	List<WebElement> sel=slt.getAllSelectedOptions();
	System.out.println(sel.size());
	for(WebElement element:sel)
	
	{
   System.out.println(element.getText());
}
}
}