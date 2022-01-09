package com.hrmsTestscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrmsUtility.BaseClass;
import com.hrmspages.Loginpage;
import com.hrmspages.Logoutpage;
import com.hrmspages.Verifypage;


public class TC001 {
@Test

public void tc001() {
	DOMConfigurator.configure("log4j.xml");
	//testcase steps
	BaseClass.openApplication();
	Verifypage.verifyTitle("HRMS");
	Loginpage.login("admin","admin123");
	Verifypage.verifyTitle("OrangeHRM");
	Logoutpage.logout();
	BaseClass.closeApplication();
	}
}
