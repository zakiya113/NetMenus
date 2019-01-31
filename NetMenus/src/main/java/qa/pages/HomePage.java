package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")
	WebElement restaurant;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")
	WebElement couponcode;
	
	
	//Initializing the Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
	
	public RestaurantPage clickOnRestaurants() {
		restaurant.click();
	return new RestaurantPage();
	}
	
	public CouponsPage clickOnCouponCode() {
		couponcode.click();
	return new CouponsPage();
	}
	
	
	
	/*public void clickOnNewCoupon(){
		Actions action = new Actions(driver);
			action.moveToElement(couponcode).build().perform();
			couponcode.click();
	}*/

	public CouponsPage clickOnCouponCode1() {
		
		Actions action = new Actions(driver);
		action.moveToElement(couponcode).build().perform();
		couponcode.click();
		return null;
	}
	
}
