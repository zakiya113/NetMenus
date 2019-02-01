package qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class RestaurantPage extends TestBase{
	RestaurantPage restaurantPage;
	
	@FindBy(xpath="//input[@id='venue_name']")
	WebElement restaurantname;
	 
	@FindBy(xpath="//textarea[@id='venue_description']")
	WebElement description;
	
	@FindBy(xpath="//input[@id='venue_address_by_user']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='zip_code']")
	WebElement Zip;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement Phone;
	
	/*@FindBy(xpath="//input[@id='site_url']")
	WebElement siteurl ;
	
	@FindBy(xpath="//input[@id='slogan']")
	WebElement slogan;*/
	
	@FindBy(xpath="//input[@id='tags']")
	WebElement Cuisines ;
	
	/*@FindBy(xpath="//input[@value='0']")
	WebElement paymentoption ;
	
	@FindBy(xpath="//input[@id='takout']")
	WebElement takeout;*/
	
	
	@FindBy(xpath="//select[@id='created_by']")
	WebElement Owner;
	
	@FindBy(xpath="//input[@id='store_manager']")
	WebElement Manager;
	
	@FindBy(xpath="//input[@id='store_manager_email']")
	WebElement Manageremail;
	
	@FindBy(xpath="//input[@id='min_order_amount']")
	WebElement Minorderamnt;
	
	@FindBy(xpath="//input[@id='sales_tax']")
	WebElement Salestax;
	
	/*@FindBy(xpath="//select[@id='delivery_fee_type']")
	WebElement Feetype;*/
	
	@FindBy(xpath="//input[@name='delivery_fee']")
	WebElement Deliveryfee;
	
	@FindBy(xpath="//textarea[@name='delivery_area_desc']")
	WebElement Dadesc;
	
	@FindBy(xpath="//input[@id='commission']")
	WebElement Commission;
	
	/*@FindBy(xpath="//textarea[@name='meta_tags']")
	WebElement metatags;*/
	
	@FindBy(xpath="//input[@id='jqSubmitForm']")
	WebElement submit;
	

//Initializing the Page Objects
		public RestaurantPage() {
			PageFactory.initElements(driver, this);
				}
	
		
		public void clickOnAddRecord(String restaurant, String Desc, String address, String zip, String phone, String cuisines, String owner, String manager, String manageremail, String minorderamnt, String salestax, String delfee, String comm) throws InterruptedException{
			
			Thread.sleep(3000);
				
			//Scroll down
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(200,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			Thread.sleep(3000);
			
			restaurantname.sendKeys(restaurant);
			Thread.sleep(1000);
			description.sendKeys(Desc);
			Thread.sleep(1000);
			Address.sendKeys(address);
			Thread.sleep(1000);
			Zip.sendKeys(zip);
			Thread.sleep(1000);
			Phone.sendKeys(phone);
			Thread.sleep(1000);
			Cuisines.sendKeys(cuisines);
			Thread.sleep(1000);
			Owner.sendKeys(owner);
			Thread.sleep(1000);
			Manager.sendKeys(manager);
			Thread.sleep(1000);
			Manageremail.sendKeys(manageremail);
			Thread.sleep(1000);
			Minorderamnt.sendKeys(minorderamnt);
			Thread.sleep(1000);
			Salestax.sendKeys(salestax);
			Thread.sleep(1000);
			Deliveryfee.sendKeys(delfee);
			Thread.sleep(1000);
			Commission.sendKeys(comm);
			Thread.sleep(1000);
			submit.click();
			
			
			}
	 
	
	
}
