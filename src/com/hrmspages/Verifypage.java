package com.hrmspages;

import org.testng.Reporter;

import com.hrmsUtility.BaseClass;

public class Verifypage extends BaseClass {
	public static void verifyTitle(String title) {
	 if(driver.getTitle().equals(title)) {
		 Reporter.log("Title matched");
	 }
	 else {
		 Reporter.log("Title not matched");
		 Reporter.log(driver.getTitle());
		 
	 }
	}

}
