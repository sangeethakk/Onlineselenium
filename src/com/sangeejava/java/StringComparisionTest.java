package com.sangeejava.java;

public class StringComparisionTest 
{

	public static void main(String[] args) 
	{      
	/*	String data="sangee";
	String data1="sangee123";
	if (data.equals(data1))
	{
		System.out.println("Both Strings are equal");
	}else
    System.out.println("Strings are not equal");
	}*/
		String data="sangee";
		String data1="sang";
		if(data.contains(data1))
		{
			System.out.println("pass");
		}else
		{
		System.out.println("Fail");
		}
		}

}
