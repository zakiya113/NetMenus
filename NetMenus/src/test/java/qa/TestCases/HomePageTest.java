package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.CouponsPage;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.pages.RestaurantPage;
import qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	RestaurantPage restaurantPage;
	CouponsPage couponsPage;
	
	public HomePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
				initialization();
				testUtil = new TestUtil();
		//restaurantPage = new RestaurantPage();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority=1)
	public void clickOnRestaurants(){
		restaurantPage = homePage.clickOnRestaurants();
	}
		
		
		@Test(priority=2)
		public void clickOnCouponCode1(){
			couponsPage = homePage.clickOnCouponCode();
			//couponsPage.clickOnAddRecord(cCode, cDesc, stDate, etDate, cDis, cTAmnt, cNoImp); 
		
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
}
