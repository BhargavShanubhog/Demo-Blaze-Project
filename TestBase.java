package pom;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utils.Common;

public class TestBase {
	protected static WebDriver driver;
	Common common;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void beforeTest(String browser,String url) {
		common=new Common();
		common.setUpBrowser(browser, url);
		driver=common.getBrowser();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	}

}
