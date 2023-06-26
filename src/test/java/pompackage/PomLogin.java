package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseHRMclass;

public class PomLogin extends BaseHRMclass {
	
	//Object repository 
	@FindBy (css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")
	WebElement Username;
	@FindBy (css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input")
     WebElement  Password;
	@FindBy (css= "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
     WebElement loginbtn ; 
	
	//initiate page elements
	
	public PomLogin() {
		PageFactory.initElements(driver, this);
		
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword (String pass) {
		Password.sendKeys(pass);
		
	}
	public void clickbtn() {
		loginbtn.click();
	}
   public String verify() {
	   return driver.getTitle();
   }
}
