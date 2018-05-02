package com.methods;

import org.testng.annotations.Test;

public class multipleTestCasesTestng
{
@Test(priority=1)//Testcase1
public void appLaunch()
{
	System.out.println("appLaunch");
}@Test(priority=2)//Testcase2
  public void appLogin()
  {
   System.out.println("appLogin");
}
@Test(priority=3)///Testcase3
	  public void appclose()
	  {
	System.out.println("appclose ");
}
}
