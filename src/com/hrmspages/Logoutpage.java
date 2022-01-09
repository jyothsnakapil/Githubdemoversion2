package com.hrmspages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrmsUtility.BaseClass;

public class Logoutpage extends BaseClass {
//objects
	static By link_logout=By.xpath("//*[@id=\"option-menu\"]/li[3]/a");
	
	
	//fun
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout completed");
		
	}
}
