package qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class DriversPage extends TestBase{

	@FindBy(name="dv_name")
	WebElement dvname; 
	
	@FindBy(id="dv_password")
	WebElement password;
	
	@FindBy(id="dv_email")
	WebElement email;
	
	@FindBy(id="fk_venue_id")
	WebElement restaurant;
	
	@FindBy(id="dv_photo_id")
	WebElement image;

	@FindBy(id="jqSubmitForm")
	WebElement saveBtn;
	
	//Initializing the Page Objects
		public DriversPage() {
			PageFactory.initElements(driver, this);
				}
	
		
		public void clickOnAddRecord(String dname, String pwd, String Email, String rest, String img) throws InterruptedException{
			
			
			Thread.sleep(3000);
			//Scroll down
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(200,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			
			//Add Record
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			
			
			
			
			dvname.sendKeys(dname);
			Thread.sleep(1000);
			password.sendKeys(pwd);
			Thread.sleep(1000);
			email.sendKeys(Email);
			Thread.sleep(1000);
			restaurant.sendKeys(rest);
			Thread.sleep(1000);
			image.click();
			Thread.sleep(1000);
			/*WebElement upload=driver.findElement(By.xpath("//input[@id='dv_photo_id']"));
			upload.sendKeys("C:\\Users\\minds9\\Downloads\\r2.jpg");
			Thread.sleep(1000);	
			driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
			Thread.sleep(1000);*/
			
			saveBtn.click();
		
			}

	
	
	
}
