package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.BaseHRMclass;
import pompackage.PomLogin;
import testdata.ExcelSheet;

public class LoginTest extends BaseHRMclass {
	
	PomLogin log;
	public LoginTest() {
		
		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Login");
		
	log =new PomLogin();	
		
	}
	
	@Test
	public void Title() {
		String actual=log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	@DataProvider
	public Object[][] Details(){
		Object result [][]= ExcelSheet.readdata("Sheet1");
		return result;
	}
	
	@Test(dataProvider="Details")
	public void Login(String name, String password) throws InterruptedException {
		log.typeusername(name);
		Thread.sleep(3000);
		log.typepassword(password);
		// log.clickbtn();
	}
	
	 @AfterMethod
	 
	 public void close() {
		 //driver.close();
	 }
}
