package Utils;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import day41.ExcelUtils;
import pom.LogIn;



public class VerificationandValidation  {
	public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();

	
	
	

	
	String filepath =System.getProperty("C:\\Users\\HP\\3D Objects\\Project59\\src\\test\\java\\Tests\\DemoBlazeData.xlsx");
	int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
	
	
	for(int i=1;i<=rows;i++) {
		//read data from excel
		String username=ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
		String password=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
		String exp_value=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
		
		LogIn f=new LogIn(driver);
		f.validation(username, password);
		String act_value=driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
		
		
		
		if(exp_value==act_value) {
			System.out.println("Test passed");
			ExcelUtils.setCellData(filepath, exp_value, i, 3, "Passed");
		}
		else {
			System.out.println("Test failed");
			ExcelUtils.setCellData(filepath, exp_value, i, 3, "Failed");
			
		}
		

}

}
}
