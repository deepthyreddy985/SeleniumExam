package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.zero.us.XeroReusableMethod;

public class LoginAutomationScript extends XeroReusableMethod  {
	

	public void TC1_Loginpage() throws InterruptedException{
		
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
	
	endReport();
	
}
	public void TC1B_IncorrectPassword() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://login.xero.com/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC1B.html");
		CreateTestScript("TC1B_IncorrectPassword", "success");
		
		
	//enter usename
	WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	entertext(Username, "deepthyreddy985@gmail.com");
	
	System.out.println("username entered successfully");
	//enter password
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	entertext(password, "123");
	
	System.out.println("entered incorrect password successfully");
	//login successfully
	WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
	ClickObject(LoginButton);
	//error message for incorrect password
	WebElement errormsg=driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"));
	System.out.println(errormsg.getText());
	 endReport();
	}
	
	public void TC1C_IncorrectEmail() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://login.xero.com/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC1C.html");
		CreateTestScript("TC1C_IncorrectEmail", "success");
		
		
	//enter usename
	WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	entertext(Username, "deepthyreddy@gmail.com");
	
	System.out.println("wrong username entered");
	//enter password
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	entertext(password, "deepthy@1");
	
	System.out.println("entered password successfully");
	//login successfully
	WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
	ClickObject(LoginButton);
	//error message for incorrect password
	WebElement errormsg=driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"));
	System.out.println(errormsg.getText());
	 endReport();
	}
	
	public  void TC1D_ForgotPassword() throws InterruptedException
	{
		Initialize_Driver();
		LaunchUrl("https://login.xero.com/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC1D.html");
		CreateTestScript("TC1D_ForgotPassword", "success");
	//forgot password	
	WebElement forgotpassword=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
	ClickObject(forgotpassword);	
	//provide username
	WebElement Username=driver.findElement(By.id("UserName"));
	entertext(Username, "deepthyreddy985@gmail.com");
	//click button to send the link to email
	WebElement continuebutton=driver.findElement(By.xpath("//span[@class='text']"));
	ClickObject(continuebutton);
	System.out.println("password reset message will sent to ur email id");
	endReport();
	}
	
	
		
	
	
}
