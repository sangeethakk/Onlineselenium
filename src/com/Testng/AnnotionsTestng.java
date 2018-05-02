package com.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotionsTestng 
{
	@Test
	public void testmethod()
	
	{
System.out.println("testmethod");
	}
@Test
 public void testmethod1()

{
	System.out.println("Test Method1");
}
@BeforeTest
public void before()
{
	System.out.println("Before Test");
}
@AfterTest
public void After()
{
	System.out.println("After test");
}
}