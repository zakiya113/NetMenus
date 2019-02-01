package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.CouponsPage;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.util.TestUtil;

public class CouponsPageTest extends TestBase{
	 
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CouponsPage couponsPage;
	
	String sheetName = "Coupons";
	
	public CouponsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		couponsPage = new CouponsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		couponsPage = homePage.clickOnCouponCode();
		
	}
	
	
	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String cCode, String cDesc, String stDate, String etDate, String cDis, String cTAmnt, String cNoImp) throws InterruptedException{ 
	homePage.clickOnCouponCode();
	couponsPage.clickOnAddRecord(cCode, cDesc, stDate, etDate, cDis, cTAmnt, cNoImp); 
	} 
	

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
	
	
	
}
	


