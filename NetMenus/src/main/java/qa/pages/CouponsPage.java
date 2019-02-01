package qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class CouponsPage extends TestBase {

	
		
	@FindBy(id="ccCode")
	WebElement couponcode; 
	
	@FindBy(name="ccDescription")
	WebElement description;
	
	@FindBy(id="ccStartDate")
	WebElement startdate;

	@FindBy(id="ccEndDate")
	WebElement enddate;
	
	@FindBy(id="ccDiscount")
	WebElement discount;
	
	@FindBy(xpath="//input[@name='ccThreshouldAmount']")
	WebElement thresholdamount;

	@FindBy(id="ccNumberOfImpression")
	WebElement numberofimpression;
	
	@FindBy(xpath="//input[@id='jqSubmitForm']")
	WebElement saveBtn;
	
	//Initializing the Page Objects
		public CouponsPage() {
			PageFactory.initElements(driver, this);
				}
	
		
		public void clickOnAddRecord(String cCode, String cDesc, String stDate, String etDate, String cDis, String cTAmnt, String cNoImp) throws InterruptedException{
			
			
			Thread.sleep(3000);

			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			
			
			couponcode.sendKeys(cCode);
			Thread.sleep(1000);
			description.sendKeys(cDesc);
			Thread.sleep(1000);
			startdate.sendKeys(stDate);
			Thread.sleep(1000);
			enddate.sendKeys(etDate);
			Thread.sleep(1000);
			discount.sendKeys(cDis);
			Thread.sleep(1000);
			thresholdamount.sendKeys(cTAmnt);
			Thread.sleep(1000);
			numberofimpression.sendKeys(cNoImp);
			Thread.sleep(1000);
			saveBtn.click();
			
			
			}


		
			
			
			
		
}
