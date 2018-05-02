package com.sangeejava.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest
{

	public static void main(String[] args)
	{
	List<String> l=new ArrayList<>();
	l.add("sangee");
	l.add("Selenium");
	l.add("QTP");
	l.add("ETL");
	l.add("LR");
	l.add("sangeetha");
	
	System.out.println(l.size());
	/*for (int i = 0; i < l.size(); i++) 
		
	{
	System.out.println(l.get(i));	
	}*/
	for(String list:l) 
		{
	System.out.println(list);
	}
	

	}

}
