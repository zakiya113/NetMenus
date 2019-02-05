package qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.HomePage;
import qa.pages.LoginPage;
import qa.pages.UsersPage;
import qa.util.TestUtil;

public class UsersPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	UsersPage usersPage;
	
	String sheetName = "Users";
	
	public UsersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		usersPage = new UsersPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		usersPage = homePage.clickOnUsers();
		
	}
	
	
	@DataProvider
	public Object[][] getOnlineFood() {
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	
	@Test(priority=1 ,dataProvider="getOnlineFood")
	
	public void clickOnAddRecord(String fname, String lname, String Email, String pwd, String gen, String Status) throws InterruptedException{ 
	homePage.clickOnUsers();
	usersPage.clickOnAddRecord(fname, lname, Email, pwd, gen, Status); 
	} 
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		}
	
	
	
	
	
}
