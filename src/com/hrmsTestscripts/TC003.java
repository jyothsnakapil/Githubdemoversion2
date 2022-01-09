package com.hrmsTestscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrmsUtility.BaseClass;

import com.hrmspages.DelEmppage;
import com.hrmspages.Loginpage;
import com.hrmspages.Logoutpage;


public class TC003 {
	@Test

	public void tc003(){
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		Loginpage.login("admin", "admin123");
		
		DelEmppage.DelEmp();
		Logoutpage.logout();
}
}
