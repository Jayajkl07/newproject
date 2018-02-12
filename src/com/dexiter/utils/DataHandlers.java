package com.dexiter.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandlers
{
	//Read data from excel
	public static String ReadDataFromExcel(String filepath,String sheetname,int rowindex,int cellIndex)
	{
		String data=null;
		try
		{
		File excel=new File("C:\\Users\\user10\\Desktop\\My Task\\New Microsoft Excel Workbook.xlsx");
		FileInputStream fis=new FileInputStream(excel);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sheetname);
		Row r=s.getRow(rowindex);
		Cell c=r.getCell(cellIndex);
		data=c.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	//Write data to excel
	public static void WriteDataToExcel(String filepath,String sheetname,int rowindex,int cellIndex,String data)
	{
		
		try
		{
		File excel=new File("C:\\Users\\user10\\Desktop\\My Task\\New Microsoft Excel Workbook.xlsx");
		FileInputStream fis=new FileInputStream(excel);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sheetname);
		Row r=s.getRow(rowindex);
		Cell c=r.getCell(cellIndex);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excel);
		wb.write(fos);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//Get data from property file
		public static String GetDataFromPropertyFile(String Filepath,String key)
		{
			String data=null;
			try
			{
				File f=new File("C:\\Users\\user10\\Desktop\\data.properties");
				FileInputStream fis=new FileInputStream(f);
				Properties prop=new Properties();
				prop.load(fis);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return data;
		}
		
	//Write Data to property file
		public static String WriteDataToPropertyFile(String Filepath,String key,String value,String comment)
		{
			String data=null;
			try
			{
				File f=new File("C:\\Users\\user10\\Desktop\\data.properties");
				FileInputStream fis=new FileInputStream(f);
				Properties prop=new Properties();
				prop.load(fis);
				prop.setProperty(key, value);
				FileOutputStream fos=new FileOutputStream(f);
				prop.store(fos, comment);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return data;
		}

	

}
