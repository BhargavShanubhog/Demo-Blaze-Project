package pom;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LapTops {
	static WebDriver driver;
	static WebDriverWait wait;
	
	@CacheLookup
	@FindBy(linkText="Laptops")
	WebElement f;
	
	@FindBy(linkText="Add to cart")
	WebElement y;
	
	public LapTops(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, TimeSpan. FromSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void letsmove(WebElement z) {
		
		f.click();
		
		z.click();
		y.click();
		
		Alert f=driver.switchTo().alert();
		String mesg=f.getText();
		System.out.println(mesg);
		f.accept();
	}
	

}
