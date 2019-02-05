package qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class UsersPage extends TestBase{

	@FindBy(name="first_name")
	WebElement firstname; 
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement email;

	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="gender")
	WebElement gender;
	
	@FindBy(id="status")
	WebElement status;
	
	@FindBy(id="jqSubmitForm")
	WebElement saveBtn;
	
	//Initializing the Page Objects
		public UsersPage() {
			PageFactory.initElements(driver, this);
				}
	
		
		public void clickOnAddRecord(String fname, String lname, String Email, String pwd, String gen, String Status) throws InterruptedException{
			
			
			Thread.sleep(3000);
			//Scroll down
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(200,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			//Add Record
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			
			
			firstname.sendKeys(fname);
			Thread.sleep(1000);
			lastname.sendKeys(lname);
			Thread.sleep(1000);
			email.sendKeys(Email);
			Thread.sleep(1000);
			password.sendKeys(pwd);
			Thread.sleep(1000);
			gender.sendKeys(gen);
			Thread.sleep(1000);
			status.sendKeys(Status);
			Thread.sleep(1000);
			saveBtn.click();
		
			}

}
