package com.hrmspages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrmsUtility.BaseClass;

public class DelEmppage extends BaseClass {
	// objects
	
	static By txt_select = By.name("loc_code") ;
    static By txt_search = By.name("loc_name");
    static By txt_search1 = By.className("plainbtn");
    static By txt_Delete = By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]");
    
    public static void DelEmp() {

    //functions
    	driver.switchTo().frame("rightMenu");
    Select drpdwn = new Select(driver.findElement(By.name("loc_code")));
	drpdwn.selectByVisibleText("Emp. ID");
	driver.findElement(By.name("loc_name")).sendKeys("0060");
	driver.findElement(By.name("chkLocID[]")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
	driver.switchTo().defaultContent();
	
}
}

