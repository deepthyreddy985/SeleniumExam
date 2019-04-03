package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.zero.us.XeroReusableMethod;

public class Logout extends XeroReusableMethod{
	public void TC4() throws InterruptedException
	{
//		AutomationScript AS=new AutomationScript();
//		AS.TC1_Loginpage();
		Initialize_Driver();
		LaunchUrl("https://login.xero.com/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC4.html");
		CreateTestScript("TC4", "success");	
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


	WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
	ClickObject(logout);
	endReport();
	}
}
