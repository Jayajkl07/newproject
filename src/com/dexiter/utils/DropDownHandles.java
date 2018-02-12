package com.dexiter.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandles
{
	//Select drop down
	public static void SelectDDLByValue(WebElement ddl,String value)
	{
		Select set=new Select(ddl); 
		set.selectByValue(value);
	}
	public static void SelectDDLByIndex(WebElement ddl,int index)
	{
		Select set=new Select(ddl);
		set.selectByIndex(index);
	}
	
	public static void SelectDDLByVisibleText(WebElement ddl,String text)
	{
		Select set=new Select(ddl);
		set.selectByValue(text);
	}
	
	//Deselect drop down
	public static void deSelectDDLByValue(WebElement ddl,String value)
	{
		Select set=new Select(ddl);
		set.deselectByValue(value);
	}
	public static void deSelectDDLByIndex(WebElement ddl,int index)
	{
		Select set=new Select(ddl);
		set.deselectByIndex(index);
	}
	
	public static void deSelectDDLByVisibleText(WebElement ddl,String text)
	{
		Select set=new Select(ddl);
		set.deselectByValue(text);
	}
	public static void deSelectAnOptions(WebElement ddl,String text)
	{
		Select set=new Select(ddl);
		set.deselectAll();
	}
	
}
