package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import MainJava.BaseClass;
import MainJava.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass {

	@BeforeClass
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void pageObjects() {
		LoginPage loginPage = new LoginPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
