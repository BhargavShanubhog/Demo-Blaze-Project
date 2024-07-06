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

public class Cart {
	static WebDriver driver;
	static WebDriverWait wait;
	
	@CacheLookup
	@FindBy(linkText="Cart")
	WebElement a;
	
	@FindBy(className="btn btn-success")
	WebElement b;
	
	@FindBy(linkText="Delete")
	WebElement delete;
	
	@FindBy(id="name")
	WebElement n;
	
	@FindBy(id="card")
	WebElement Card;
	
	@FindBy(className="btn btn-primary")
	WebElement purchase;
	
	public Cart(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, TimeSpan. FromSeconds(10));
		PageFactory.initElements(driver, this);
		}
	
	

	public void CheckUp(String Name, String cardno) {
		Reporter.log("Name ="+Name);
		Reporter.log("cardno="+cardno);
		
		a.click();
		wait.until(ExpectedConditions.elementToBeClickable(b));
		
		b.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(n));
		n.sendKeys(Name);
		
		wait.until(ExpectedConditions.elementToBeClickable(Card));
		Card.sendKeys(cardno);
		
		purchase.click();
		
		Alert f=driver.switchTo().alert();
		String mesg=f.getText();
		System.out.println(mesg);
		f.accept();
	}
	
	

}
