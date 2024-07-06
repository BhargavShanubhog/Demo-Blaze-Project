package Tests;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LapTops;
import pom.Monitors;
import pom.TestBase;
import pom.phones;

public class HomePageTest extends TestBase{
	@Parameters({"linkText"})
	@Test
	public void phonesValidation(WebElement a) {
		phones p=new phones(driver);
		p.letsmove(a);
	}
	
	@Parameters({"linkText1"})
	@Test
	public void MonitorsValidation(WebElement a) {
		Monitors p=new Monitors(driver);
		p.letsmove(a);
	}
	
	@Parameters({"linkText2"})
	@Test
	public void LaptopsValidation(WebElement a) {
		LapTops p=new LapTops(driver);
		p.letsmove(a);
	}

}
