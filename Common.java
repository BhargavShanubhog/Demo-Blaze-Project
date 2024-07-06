package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	private WebDriver driver;
	
	public void setUpBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("FireFox"))
			driver=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("Edge"))
			driver=new EdgeDriver();
		else {
			System.out.println("Valid browser was not provided, hence quitting the automation run");
			System.exit(0);
		}
		
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	public WebDriver getBrowser() { // driver is a private variable so getbrowser method and use it other class
		return driver;
	}
	

	public void closeTab() { // close
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
