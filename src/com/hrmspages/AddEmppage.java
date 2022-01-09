package com.hrmspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.hrmsUtility.BaseClass;

public class AddEmppage extends BaseClass {

//objects

	static By txt_PIM = By.linkText("PIM") ;
    static By txt_add = By.linkText("Add Employee");
    static By txt_lastname = By.xpath("//input[@id='txtEmpLastName']");
    static By txt_firstname = By.xpath("//input[@id='txtEmpFirstName']");
    static By btn_add =By.id("btnEdit");

    public static void AddEmp(String LN , String  FN) {
     //functions
    	WebElement element = driver.findElement(By.linkText("PIM"));
    	Actions action = new Actions (driver);
    	action.moveToElement(element).perform();
    	driver.findElement(By.linkText("Add Employee")).click();
    	
    	
    	//enter into frame
    	driver.switchTo().frame("rightMenu");
    	driver.findElement(txt_lastname).sendKeys("kapil");
    	driver.findElement(txt_firstname).sendKeys("jyothsna");
    	driver.findElement(btn_add).click();
    	driver.switchTo().defaultContent();
     
    }    
    	
	}
    
 	
    	
    	
    	
    	
    	








