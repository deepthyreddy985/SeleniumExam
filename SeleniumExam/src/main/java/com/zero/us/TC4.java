package com.zero.us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4 extends XeroReusableMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
	
//	AutomationScript AS=new AutomationScript();
//	AS.TC1_Loginpage();
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC1.html");
	CreateTestScript("TC1_loginpage", "success");	
//enter usename
WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Email address']"));
entertext(Username, "deepthyreddy985@gmail.com");

System.out.println("username entered successfully");
//enter password
WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
entertext(password, "deepthy@1");

System.out.println("entered password successfully");
//login successfully
WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
ClickObject(LoginButton);

WebElement dropdown=driver.findElement(By.xpath("//button[@title='Deepthy Koduru']"));
ClickObject(dropdown);


WebElement logout=driver.findElement(By.xpath("//button[@id='logout']"));
selectdropdown(logout, "Logout");
}
	
}
