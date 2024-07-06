package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.TestBase;

public class BasicValidations extends TestBase{
	

	@Test
	public void urlValidation() {
		String expectedResult = "https://www.demoblaze.com/";
		String actualResult = driver.getCurrentUrl(); //Fetching URL
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the page URL,");
	}

}
