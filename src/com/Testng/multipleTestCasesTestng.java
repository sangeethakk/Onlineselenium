package com.Testng;

import org.testng.annotations.Test;

public class multipleTestCasesTestng
{
@Test(priority=1)//Testcase1
public void appLaunch()
{
	System.out.println("appLaunch");
}
@Test(dependsOnMethods="appLaunch")//Testcase2
  public void appLogin()
  {
   System.out.println("appLogin");
}
@Test(dependsOnMethods="appLogin")///Testcase3
	  public void appclose()
	  {
	System.out.println("appclose ");
}
}
