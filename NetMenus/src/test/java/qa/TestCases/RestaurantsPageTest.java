package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.pages.RestaurantPage;
import qa.util.TestUtil;

public class RestaurantsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	RestaurantPage restaurantPage;	
	
	String sheetName = "Restaurants";
	
	public RestaurantsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		restaurantPage = new RestaurantPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		
	}
	
	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String restaurant, String Desc, String address, String zip, String phone, String cuisines, String owner, String manager, String manageremail, String minorderamnt, String salestax, String delfee, String comm) throws InterruptedException{ 
	homePage.clickOnRestaurants();
	restaurantPage.clickOnAddRecord(restaurant, Desc, address, zip, phone, cuisines, owner, manager, manageremail,minorderamnt,  salestax,delfee,comm ); 
	} 
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
}
