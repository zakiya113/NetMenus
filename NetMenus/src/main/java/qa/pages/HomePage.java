package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")
	WebElement restaurant;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")
	WebElement couponcode;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")
	WebElement users;
	
	@FindBy(xpath="//a[contains(text(),'Owners')]")
	WebElement owners;
	
	@FindBy(xpath="//a[contains(text(),'Restaurant Plans')]")
	WebElement restaurantplans;

	@FindBy(xpath="//a[contains(text(),'Drivers')]")
	WebElement drivers;
	
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
	
	public UsersPage clickOnUsers() {
		users.click();
	return new UsersPage();
	}

	public OwnersPage clickOnOwners() {
		owners.click();
	return new OwnersPage();
	}
	
	public RestaurantPlansPage clickOnRestaurantPlans() {
		restaurantplans.click();
	return new RestaurantPlansPage();
	}
	
	public DriversPage clickOnDrivers() {
		drivers.click();
	return new DriversPage();
	}
	
}
