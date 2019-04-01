package com.zero.us;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.zero.us.TC1;
public class ProfileModule  extends XeroReusableMethod{

	public void TC3() throws InterruptedException
	{
//		AutomationScript AS=new AutomationScript();
//		AS.TC1_Loginpage();
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
	//click daskboard
		
	WebElement dashboard=driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
	ClickObject(dashboard);
	Thread.sleep(3000);
	//accounts
	WebElement accounts=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
	ClickObject(accounts);
	//dropdown
//	WebElement dropdown=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
//	ClickObject(dropdown);
	Select reports=new Select(driver.findElement(By.xpath("//a[contains(text(),'Reports')]")));
	reports.selectByVisibleText("Reports");
		Thread.sleep(3000);
		List<WebElement> listdropdown=reports.getOptions();
		System.out.println(listdropdown.size());
		int UserMenu=listdropdown.size()-1;
		System.out.println("total menu:"+UserMenu);
		for(int i=0;i<listdropdown.size();i++)
		{
			listdropdown.get(i).getText();
		}
	//settings
		WebElement settings=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Select select =new Select(settings);
		List<WebElement> xyz_list=select.getOptions();
		int list=xyz_list.size();
		System.out.println("total count is"+list);
		for(WebElement ele:xyz_list)
		{
			String month_name=ele.getText();
			System.out.println("list is= "+month_name);
		}
		
		//
	}
	
}
