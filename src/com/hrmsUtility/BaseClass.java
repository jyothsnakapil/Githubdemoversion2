package com.hrmsUtility;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;

public class BaseClass {
	//driver object
	public static WebDriver driver;
	//OpenApp , CloseApp
	public  static void openApplication() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamat\\Downloads\\chromedriver_win32 (1)\\ChromeDriver.exe");
	driver=new  ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Reporter.log("Application opened");
	}
public static void closeApplication() {
	driver.close();
	Reporter.log("Application closed");
	}
public static void AddEmp() {
	//mouseover on pim menu
	System.out.println("Employee added");
	Reporter.log("Employee added");
}

	public static void DelEmp() {
		System.out.println("Employee deleted");
		Reporter.log("Employee deleted");
		
		}
}
