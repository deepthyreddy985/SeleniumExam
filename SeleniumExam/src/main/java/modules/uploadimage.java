package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.zero.us.XeroReusableMethod;

public class uploadimage extends XeroReusableMethod{

	public void TC6() throws InterruptedException {
	Initialize_Driver();
	LaunchUrl("https://login.xero.com/");
	WebDriverWait wait = new WebDriverWait(driver, 40);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Initialize_path("C:\\ExtentReports\\xeroreports\\xeroReportTC6.html");
	CreateTestScript("TC6", "success");	
	
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

WebElement profile=driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]//a[1]"));
ClickObject(profile);
//driver.switchTo().frame("//div[@id='form']");
//WebElement xyz=driver.findElement(By.xpath("//div[@id='form']"));
//ClickObject(xyz);
//WebElement uploadimg=driver.findElement(By.xpath("//div[@id='button-1041']"));

WebElement changeimg=driver.findElement(By.xpath("//span[contains(text(),'Change Image')]"));
ClickObject(changeimg);
Thread.sleep(3000);

//WebElement browse=driver.findElement(By.xpath("//input[@id='filefield-1188-button-fileInputEl']"));
//ClickObject(browse);

//WebElement browsePhoto=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='filefield-1188-button-fileInputEl']")));
WebElement browse=driver.findElement(By.xpath("//input[@name='file']"));
browse.sendKeys("C:\\Users\\venka\\Desktop\\20140308_064121000_iOS.jpg");
Thread.sleep(3000);





//table[@id='display-1189']"



WebElement uploadbutton=driver.findElement(By.xpath("//div[@id='button-1178-btnWrap']"));
ClickObject(uploadbutton);

WebElement save=driver.findElement(By.xpath("//div[@id='button-1164']"));
ClickObject(save);
endReport();






}



}
