package modules;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.zero.us.XeroReusableMethod;

//import com.zero.us.TC1;
public class ProfileModule  extends XeroReusableMethod{

	public void TC3() throws InterruptedException
	{
//		AutomationScript AS=new AutomationScript();
//		AS.TC1_Loginpage();
		Initialize_Driver();
		LaunchUrl("https://login.xero.com/");
		Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC3.html");
		CreateTestScript("TC3", "success");	
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
	
	WebElement reports= driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
	ClickObject(reports);
	
	WebElement contacts= driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
	ClickObject(contacts);
	
	WebElement xyz= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
	ClickObject(xyz);
	
	WebElement settings= driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
	ClickObject(settings);
	
	WebElement xyz1= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
	ClickObject(xyz1);
	
	WebElement addnew= driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
	ClickObject(addnew);
	//driver.executeScript("window.history.go(-1)");
//	PageObject nextPage = getPageFromURL(driver.getCurrentUrl());
//    PageFactory.initElements(driver, nextPage);
//    return nextPage;
    driver.navigate().back();
    
	WebElement xyz2= driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
	ClickObject(xyz2);
	
	WebElement files= driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
	ClickObject(files);
	
	WebElement notification= driver.findElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
	ClickObject(notification);
	
	WebElement search= driver.findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
	ClickObject(search);
	
	WebElement help= driver.findElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
	ClickObject(help);
	
	endReport();
	
	
	
	
	
//	Select reports=new Select(driver.findElement(By.xpath("//a[contains(text(),'Reports')]")));
//	reports.selectByVisibleText("Reports");
//		Thread.sleep(3000);
//		List<WebElement> listdropdown=reports.getOptions();
//		System.out.println(listdropdown.size());
//		int UserMenu=listdropdown.size()-1;
//		System.out.println("total menu:"+UserMenu);
//		for(int i=0;i<listdropdown.size();i++)
//		{
//			listdropdown.get(i).getText();
//		}
//	//settings
//		WebElement settings=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
//		Select select =new Select(settings);
//		List<WebElement> xyz_list=select.getOptions();
//		int list=xyz_list.size();
//		System.out.println("total count is"+list);
//		for(WebElement ele:xyz_list)
//		{
//			String month_name=ele.getText();
//			System.out.println("list is= "+month_name);
//		}
		
		//
	}
	
}
