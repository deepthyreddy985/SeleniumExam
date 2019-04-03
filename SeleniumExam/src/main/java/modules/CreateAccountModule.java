package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.zero.us.XeroReusableMethod;

public class CreateAccountModule extends XeroReusableMethod{
	
	public void TC2_signupto_XDC() throws InterruptedException
	{
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
//		WebElement recaptchacheckbox=driver.findElement(By.id("recaptcha-anchor-label"));
//		ClickObject(recaptchacheckbox);
		//select terms and conditions
		WebElement terms=driver.findElement(By.xpath("//label[@class='form-label text']"));
		SelectCheckBox(terms, "i have read and i agree to the terms and offers");
		
		WebElement getstarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickObject(getstarted);
		endReport();
	}
	public void TC2B_emptyfields() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC2B.html");
		CreateTestScript("TC2B_emptyfields", "success");
		//freetrail button
		WebElement freetrail=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		ClickObject(freetrail);
		
		//signup button
		WebElement getstarted=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickObject(getstarted);
		System.out.println("all fields are empty");
		Thread.sleep(3000);
		//email
		WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		entertext(email, "deepti2019");
		Thread.sleep(3000);
		//signup
		WebElement getstarted1=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickObject(getstarted1);
		//error msg
		WebElement errormsg=driver.findElement(By.xpath("span[@id='signup-form-error-message-5']"));
		System.out.println(errormsg.getText());
				
		endReport();
	}
	public void TC2C() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC2C.html");
		CreateTestScript("TC2C", "success");
		//freetrail button
		WebElement freetrail=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		ClickObject(freetrail);
		//terms checkbox
		WebElement terms=driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		ClickObject(terms);
		Thread.sleep(3000);
		String parent= driver.getWindowHandle();
		for(String handle: driver.getWindowHandles())
		{
		driver.switchTo().window(handle);
		}
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		//click on free trail
//		WebElement freetrail1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
//		ClickObject(freetrail1);
		//click policy
		WebElement policy=driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		ClickObject(policy);
		Thread.sleep(3000);
		endReport();
		
	}
	public void TC2D() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC2D.html");
		CreateTestScript("TC2D", "success");
		//freetrail button
		WebElement freetrail=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		ClickObject(freetrail);
		//fulloffer checkbox
		WebElement fullofferdetails=driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		ClickObject(fullofferdetails);
		Thread.sleep(3000);	
		endReport();
	}
	public void TC2E() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC2E.html");
		CreateTestScript("TC2E", "success");
		//freetrail button
		WebElement freetrail=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		ClickObject(freetrail);	
		//accountant link
		WebElement accountantlink=driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		ClickObject(accountantlink);
		//Thread.sleep(3000);	
		endReport();
	}
	
	public void TC5() throws InterruptedException
	{

		Initialize_Driver();
		LaunchUrl("https://www.xero.com/us/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC5.html");
		CreateTestScript("TC5", "success");
		System.out.println("Fail:there is no create account page");
		logger.log(LogStatus.FAIL,"Create account page could not found");
		endReport();
	}
	
}
