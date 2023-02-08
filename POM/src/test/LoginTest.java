package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test(priority = 0, groups= {"smoke","regression"})
	public void verifyTitleofLoginPage() {
	String verifyTitleOfLoginPage = loginPage.titleOfLoginPage();	
	Assert.assertEquals(verifyTitleOfLoginPage,"Login");
	}
	

}
