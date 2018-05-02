package com.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataTest 
{

	public static void main(String[] args) throws Exception
	{
		File src=new File("C:\\Users\\satish\\Desktop\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		
		//Workbook objesct
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Worksheet object
		XSSFSheet ws=wb.getSheet("Sheet1");
		//rowscount
		int rowcount=ws.getLastRowNum();
		
		for (int i = 0; i <=rowcount; i++)
		{
			
		
		
		String data=ws.getRow(i).getCell(0).getStringCellValue();
		String data1=ws.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println(data+"  "+data1);
		
	}

}
}