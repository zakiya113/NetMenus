package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.DriversPage;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.util.TestUtil;

public class DriversPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	DriversPage driversPage;
	
	String sheetName = "Drivers";
	
	public DriversPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		driversPage = new DriversPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		driversPage = homePage.clickOnDrivers();
		
	}
	

	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String dname, String pwd,String Email, String rest,String img) throws InterruptedException{ 
	homePage.clickOnDrivers();
	driversPage.clickOnAddRecord(dname, pwd, Email, rest, img); 
	} 
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
	
}
