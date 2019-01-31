package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory-OR:
	//Page Factory-OR
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//button[@value='submit']")
		WebElement loginBtn;
		
	
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
		WebElement logo;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		}
	
	public boolean validateNetMenusImage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
}
