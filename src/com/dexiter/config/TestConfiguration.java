package com.dexiter.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dexiter.utils.DataHandlers;

public class TestConfiguration
{
 public static WebDriver Getinstance()
 {
	 WebDriver driver=null;
	 String browseType=DataHandlers.GetDataFromPropertyFile("configuration","browser");
	 String url=DataHandlers.GetDataFromPropertyFile("configuration","url");
	 
	 if(browseType.equalsIgnoreCase("firefox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 else if(browseType.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user10\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 else
	 {
		 System.out.println("....Invalid browser type");
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 driver.get(url);
	 return driver;
 }
}
