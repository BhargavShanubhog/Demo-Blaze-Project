package Tests;

import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LogIn;

import pom.TestBase;

public class LogInValidations extends TestBase {
	@Parameters({"validUserName","validPassword"})
	@Test
	public void ValidCredentials(@Optional String username, String password ) throws InterruptedException {
		LogIn a=new LogIn(driver);
		a.validation(username, password);
		
	}
	@Parameters({"invalidUserName","validPassword"})
	@Test
	public void inValidusername(String username, String password ) throws InterruptedException {
		LogIn a=new LogIn(driver);
		a.validation(username, password);
		
	}
	@Parameters({"validUserName","invalidPassword"})
	@Test
	public void inValidpassword(String username, String password ) throws InterruptedException {
		LogIn a=new LogIn(driver);
		a.validation(username, password);
	}
	@Parameters({"invalidUserName","invalidPassword"})
	@Test
	public void inValidCredentials(String username, String password ) throws InterruptedException {
		LogIn a=new LogIn(driver);
		a.validation(username, password);
		
	}
	@Parameters({"validUserName"})
	@Test
	public void nopassword(String username ) throws InterruptedException {
		String password="";
		LogIn a=new LogIn(driver);
		a.validation(username, password);
		
	}
	@Parameters({"validPassword"})
	@Test
	public void nousername( String password ) throws InterruptedException {
		String username="";
		LogIn a=new LogIn(driver);
		a.validation(username, password);
	}
	
	@Test
	public void blankCredentials() throws InterruptedException {
		String username="";
		String password="";
		LogIn a=new LogIn(driver);
		a.validation(username, password);
		
	}


}
