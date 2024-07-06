package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LogIn  {
	private  WebDriver driver;
	private  WebDriverWait wait;
	
	@CacheLookup
	@FindBy(xpath=("//a[@id='login2']"))
	WebElement link;
	
	@FindBy(className="form-control")
	WebElement u;
	
	@FindBy(xpath=("//a[@id=loginpassword]"))
	WebElement p;
	
	@FindBy(xpath=("//button[@onclick=logIn()]"))
	WebElement button;
	
	
	
	public LogIn(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, TimeSpan. FromSeconds(10));
		PageFactory.initElements(driver, this);
	}


	


	public void validation(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub
		Reporter.log("username="+username);
		Reporter.log("password="+password);
		
		
		
		
		link.click();
		wait.until(ExpectedConditions.elementToBeClickable(u));
		
		
		u.clear();
		u.sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(p));
		
		p.clear();
		p.sendKeys(password);
		
		button.click();
        Alert alert = driver.switchTo().alert();	
		
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
		
		Thread.sleep(5000);
		
		alert.accept();
		
	}





	
	
	
	

}
