package com.Testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
 @Test
 public void Validation()
 {
	 String empName="Sangeetha";
	 String empName1="Sangeetha";
	 {
		 //Validation
		//Assert.assertEquals(empName, empName1,"Both string are not equal");
	 Assert.assertEquals(12, 12);
	}
 }
}