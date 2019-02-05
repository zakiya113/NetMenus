package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.pages.OwnersPage;
import qa.util.TestUtil;

public class OwnersPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	OwnersPage ownersPage;
	
	String sheetName = "Owners";
	
	public OwnersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		ownersPage = new OwnersPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		ownersPage = homePage.clickOnOwners();
		
	}
	
	
	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String fname, String lname, String Email, String pwd, String splanid, String Status) throws InterruptedException{ 
	homePage.clickOnOwners();
	ownersPage.clickOnAddRecord(fname, lname, Email, pwd, splanid, Status); 
	} 
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
}
