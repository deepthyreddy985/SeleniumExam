package com.zero.us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC5 extends XeroReusableMethod {
public static void main(String[] args) throws InterruptedException {
	

	Initialize_Driver();
	LaunchUrl("https://www.xero.com/us/");
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC2.html");
	CreateTestScript("TC2_signupto_XDC", "success");
	//freetrail button
	WebElement freetrail=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	ClickObject(freetrail);
	//first name
	WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
	entertext(firstname, "deepti");
	//last name
	WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
	entertext(lastname, "D");
	//email
	WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
	entertext(email, "deepti9102@gmail.com");
	//phone number
	WebElement phone=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
	entertext(phone, "7204290606");
	//country
	Select country= new Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
	country.selectByValue("United States");
	//select captcha
	WebElement recaptchacheckbox=driver.findElement(By.id("recaptcha-anchor-label"));
	ClickObject(recaptchacheckbox);
	//select terms and conditions
	WebElement terms=driver.findElement(By.xpath("//label[@class='form-label text']"));
	SelectCheckBox(terms, "i have read and i agree to the terms and offers");
	
	WebElement getstarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
	ClickObject(getstarted);
	endReport();
}
	
	
}
