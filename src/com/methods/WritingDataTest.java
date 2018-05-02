package com.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataTest
{

	public static void main(String[] args) throws Exception 
	{
		File src=new File("C:\\Users\\satish\\Desktop\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		
		//Workbook objesct
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//Worksheet object
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		ws.getRow(1).createCell(2).setCellValue(true);
		ws.getRow(2).createCell(2).setCellValue(false);
		
		FileOutputStream fos=new FileOutputStream(src);
		
		wb.write(fos);
		wb.close();

	}

}
