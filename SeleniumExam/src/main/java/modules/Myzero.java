package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zero.us.DriverEngine;
import com.zero.us.XeroReusableMethod;

public class Myzero extends XeroReusableMethod
{
	public void TC8A() throws InterruptedException
	{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8A.html");
	CreateTestScript("TC8A", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg);

//driver.navigate().to("https://my.xero.com/!xkcD/Organisation/Setup");

//String Parent =driver.getWindowHandle();
//System.out.println("parent window is"+parent);
//driver.findElement(By.xpath("//body[@class='x-page x-body x-webkit x-chrome']"))

//driver.switchTo().window(By.id("express-container-outerCt"));
//driver.switchTo().frame()
//WebElement myElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("//body[@class='x-page x-body x-webkit x-chrome']")));
//myElement.click();

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}


WebElement Orgname=driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
entertext(Orgname, "abcd");

Select OrgpayTax= new Select(driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']")));
OrgpayTax.selectByValue("United States");

Select timezone= new Select(driver.findElement(By.xpath("//input[@id='cmbTimeZone-inputEl']")));
timezone.selectByValue("(UTC-08:00) Pacific Time (US & Canada)");



//public static WebElement Time_dd(WebDriver driver,String Tvalue) throws Exception {
//obj = ReusableMethods.findElement((By.id("cmbTimeZone-inputEl")),"Time dd",driver);
//ReusableMethods.entertext(obj, "Time dd", Tvalue);
//return obj;

//WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
//ClickObject(addOrg);

endReport();
}
public void TC8B() throws InterruptedException
{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8B.html");
	CreateTestScript("TC8B", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg);

driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard/Setup");

WebElement Orgname=driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
entertext(Orgname, "abc");

Select OrgpayTax= new Select(driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']")));
OrgpayTax.selectByValue("United States");

//WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
//ClickObject(addOrg);
endReport();
}
public void TC8C() throws InterruptedException
{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8A.html");
	CreateTestScript("TC8A", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg);

driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard/Setup");

WebElement Orgname=driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
entertext(Orgname, "abc");

Select OrgpayTax= new Select(driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']")));
OrgpayTax.selectByValue("United States");

endReport();
}
public void TC8D() throws InterruptedException
{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8A.html");
	CreateTestScript("TC8A", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg);

endReport();
}
public void TC8E() throws InterruptedException
{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8A.html");
	CreateTestScript("TC8A", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg); 

endReport();

}

public void TC8F() throws InterruptedException
{
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC8A.html");
	CreateTestScript("TC8A", "success");	
	
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

WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
ClickObject(xyz);

WebElement myzero= driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
ClickObject(myzero);

//String currenturl=  driver.getCurrentUrl();
//driver.switchTo().window(currenturl);

for(String winHandle: driver.getWindowHandles()) {
	driver.switchTo().window(winHandle);
}

//driver.switchTo().window("https://my.xero.com/!xkcD/Dashboard");

WebElement addOrg= driver.findElement(By.xpath("//a[@class='x-btn green']"));
ClickObject(addOrg);

endReport();
}
	
}
