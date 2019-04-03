package com.zero.us;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class XeroReusableMethod  {

	protected static WebDriver driver;
	static ExtentReports report;
	protected static ExtentTest logger;
	public static ExtentReports Initialize_path(String path) /*String TestScriptName*/
	{
		System.out.println("start");
		//String path="C:\\ExtentReports\\xeroreports\\xeroReportTC1.html";
		report=new ExtentReports(path,true);
		
		//report=new ExtentReports(path);
		return report;
	}
	public static ExtentTest CreateTestScript(String TestScriptName,String text)
	{
		logger=report.startTest(TestScriptName,text);
		return logger;
	}
	public static void Initialize_Driver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	
	public static void LaunchUrl(String url)
	{
			driver.get(url);
				//LaunchUrl("https://login.xero.com/");
//		logger=report.startTest("xero website");
//		logger.log(LogStatus.INFO, "xero application is launched");
			driver.manage().window().maximize();
	}	
	public static void entertext(WebElement element, String textval) throws InterruptedException
	{
	if(element.isDisplayed())
	{
		//Thread.sleep(4000);
		element.sendKeys(textval);
		
		System.out.println("pass: entered the value ");
		logger.log(LogStatus.PASS, "textdata entered successfully");
	}
	else
	{
		System.out.println("fail:"+element+"could not be found");
		logger.log(LogStatus.FAIL, "wrong data entered ");
	}

	}
	public static void ClickObject(WebElement element) throws InterruptedException
	{
		if(element.isDisplayed()) {
			Thread.sleep(2000);
			element.click();
			System.out.println("pass: button clicked");
			logger.log(LogStatus.PASS, "button clicked");
		}
		else
		{
			System.out.println("fail:button is not clicked");
			logger.log(LogStatus.FAIL, "button is not clicked ");
		}
	}
	
public static void SelectCheckBox(WebElement element, String objName) throws InterruptedException
{
	if(element==null)
		return;
	if(element.isDisplayed()) {
	if(!element.isSelected()) {
		Thread.sleep(2000);
		element.click();
		System.out.println("element is successfully clicked");
		logger.log(LogStatus.PASS, "Clicked on remember me checkbox");
	}
	}
	else {
		System.out.println("unable to find the button");
		logger.log(LogStatus.FAIL, "missed the click button for remember me checkbox");
	}
}
	public static void selectdropdown(WebElement element, String value) throws InterruptedException
	{
		if(element==null) 
			return;
		if(element.isDisplayed()) {
		if(element.isSelected()) {
			Select userNavButton=new Select(element);
			userNavButton.selectByVisibleText(value);
			
			System.out.println("element is successfully clicked");
			logger.log(LogStatus.PASS, "dropdown items are not selected");
			
		}
		}
		else
		{
			System.out.println("unable to find the selection");
			logger.log(LogStatus.FAIL, "dropdown items a not selected");
		}
	}
	
public static void endReport()
{
	report.endTest(logger);
	report.flush();
	System.out.println("end");
	driver.quit();
	
}
	
	


}
