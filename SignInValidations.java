package Tests;

import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.SignIn;
import pom.TestBase;

public class SignInValidations extends TestBase {
	@Parameters({"validUserName","validPassword"})
	@Test
	public void ValidCredentials(String username, String password ) throws InterruptedException {
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}
	@Parameters({"invalidUserName","validPassword"})
	@Test
	public void inValidusername(String username, String password ) throws InterruptedException {
		SignIn a=new SignIn(driver,10);
		a.loginWithCredentials(username, password);
		
	}
	@Parameters({"validUserName","invalidPassword"})
	@Test
	public void inValidpassword(String username, String password ) throws InterruptedException {
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}
	@Parameters({"invalidUserName","invalidPassword"})
	@Test
	public void inValidCredentials(String username, String password ) throws InterruptedException {
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}
	@Parameters({"validUserName"})
	@Test
	public void nopassword(String username ) throws InterruptedException {
		String password="";
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}
	@Parameters({"validPassword"})
	@Test
	public void nousername( String password ) throws InterruptedException {
		String username="";
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}
	
	@Test
	public void blankCredentials() throws InterruptedException {
		String username="";
		String password="";
		SignIn a=new SignIn(driver, 10);
		a.loginWithCredentials(username, password);
		
	}


}
