package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantPage {
	RestaurantPage restaurantPage;
	
	@FindBy(xpath="//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")
	WebElement restaurant;
	 
	@FindBy(xpath="//a[@class='addrecord btn btn-info']")
	WebElement addrecord;
	
	
	//Initializing the Page Objects
			public RestaurantPage() {
				PageFactory.initElements(driver, this);
					}

			public void createNewCoupon(String cCode, String cDesc, String stDate, String etDate, String cDis, String cTAmnt, String cNoImp) throws InterruptedException{
	
				Thread.sleep(3000);
		
	
				restaurantPage.createNewCoupon(K2, demo, 01-31-2019, 02-28-2019, 8, 2000, 2);

