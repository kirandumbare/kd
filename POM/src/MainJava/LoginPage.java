package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {

	//All the locators of page
	@FindBy(xpath="//*[text()='Login']")
	WebElement txtLoginPage;
	
	
	//Initialization of locators and variables 
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//methods required to perform test steps 
/*Author : Kiran Dumbare
 * Date  :04 Feb 2023
 * Description : This Test Method is use to verify login page title
 * Parameter return : String 
 */

	public String titleOfLoginPage() {
		return txtLoginPage.getText();
		
		
	}
}
