package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.pages.RestaurantPlansPage;
import qa.util.TestUtil;

public class RestaurantPlansPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	RestaurantPlansPage restaurantPlansPage;
	
	String sheetName = "RestaurantPlan";
	
	public RestaurantPlansPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		restaurantPlansPage = new RestaurantPlansPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		restaurantPlansPage = homePage.clickOnRestaurantPlans();
		
	}
	

	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String pname, String pamnt, String Status) throws InterruptedException{ 
	homePage.clickOnRestaurantPlans();
	restaurantPlansPage.clickOnAddRecord(pname, pamnt, Status); 
	} 
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
	
	
}
