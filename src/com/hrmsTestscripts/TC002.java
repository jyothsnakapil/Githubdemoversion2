package com.hrmsTestscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrmsUtility.BaseClass;
import com.hrmspages.AddEmppage;
import com.hrmspages.Loginpage;
import com.hrmspages.Logoutpage;
import com.hrmspages.Verifypage;

public class TC002 {
@Test

public void tc002(){
	DOMConfigurator.configure("log4j.xml");
	BaseClass.openApplication();
	Loginpage.login("admin", "admin123");
	Verifypage.verifyTitle("OrangeHRM");
	AddEmppage.AddEmp("kapil","jyothsna");
	Logoutpage.logout();
	
	
	
	
}
	
	
}
