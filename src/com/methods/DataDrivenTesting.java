package com.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting 
{

	public static void main(String[] args) throws Exception 
	{
		
		FunctionalLibrary s=new FunctionalLibrary();
		s.applaunch("http://opensource.demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/0025");
		s.appLogin("Admin", "admin");
		
		File src=new File("C:\\Users\\satish\\Desktop\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		
		//Workbook objesct
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Worksheet object
		XSSFSheet ws=wb.getSheet("Sheet1");
		//rowscount
		int rowcount=ws.getLastRowNum();
		
		for (int i = 1; i <=rowcount; i++)
		{
			
		
		
		String fname=ws.getRow(i).getCell(0).getStringCellValue();
		String lname=ws.getRow(i).getCell(1).getStringCellValue();
		
		String results=s.empAdd(fname, lname);
		
		ws.getRow(i).createCell(2).setCellValue(results);
		
		FileOutputStream fos=new FileOutputStream(src);
		
		wb.write(fos);
		
	}
		wb.close();
		
		//appLogout
		//appLogin
	{

	}
	}
}