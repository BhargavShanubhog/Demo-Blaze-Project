package pom;

import java.time.Duration;

//import pom.WebDriverWait;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SignIn {
	//private static final String Duration = null;

	//private static Object timeout;

	private WebDriver driver;
	private  static WebDriverWait wait;
	
	@CacheLookup
	@FindBy(linkText="Sign up")
	WebElement link;
	
	@FindBy(id="sign-username")
	WebElement user;
	
	@FindBy(id="sign-password")
	WebElement passd;
	
	@FindBy(xpath="//button[@onclick=register()]")
	WebElement button;
	
	public SignIn(WebDriver driver,long timeoutInSeconds) { //constructor pass the private variable
		this.driver = driver;
		wait = new WebDriverWait(driver, TimeSpan. FromSeconds(10));//this is an instance, non static gets connected (driver) this is called pass by reference
		PageFactory.initElements(driver, this);
		
	}
	
	
	


	public void loginWithCredentials(String username, String password) throws InterruptedException {

		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
		
		link.click();
		
		user.clear();
		user.sendKeys(username);
		
		
		
		
		
		
		
		passd.clear();
		passd.sendKeys(password);
		
		button.click();
		
		Alert alert = driver.switchTo().alert();	
		
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
		
		Thread.sleep(5000);
		
		alert.accept();
	}
		
		
	
	
	


}
