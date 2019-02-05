package qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class RestaurantPlansPage extends TestBase{

	@FindBy(name="plan_name")
	WebElement planname; 
	
	@FindBy(id="plan_amount")
	WebElement planamount;
	
	@FindBy(id="plan_status")
	WebElement status;
	
	@FindBy(id="jqSubmitForm")
	WebElement saveBtn;
	
	//Initializing the Page Objects
		public RestaurantPlansPage() {
			PageFactory.initElements(driver, this);
				}
	
		
		public void clickOnAddRecord(String pname, String pamnt, String Status) throws InterruptedException{
			
			
			Thread.sleep(3000);
			
			
			//Add Record
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			
			
			planname.sendKeys(pname);
			Thread.sleep(1000);
			planamount.sendKeys(pamnt);
			Thread.sleep(1000);
			status.sendKeys(Status);
			Thread.sleep(1000);
			saveBtn.click();
		
			}

	
}
