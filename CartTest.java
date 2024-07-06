package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Cart;
import pom.TestBase;

public class CartTest  extends TestBase{
	@Parameters({"validName","validCardNo"})
	@Test
	public void valid(String Name, String cardno) {
		Cart c=new Cart(driver);
		c.CheckUp(Name, cardno);
		
	}
	@Parameters({"validName"})
	@Test
	public void nocardno(String Name, String cardno) {
		Cart c=new Cart(driver);
		c.CheckUp(Name, cardno);
		
	}
	@Parameters({"validCardNo"})
	@Test
	public void noname(String Name, String cardno) {
		Cart c=new Cart(driver);
		c.CheckUp(Name, cardno);
		
	}
	@Test
	public void blank() {
		String name=" ";
		String card=" ";
		Cart c=new Cart(driver);
		c.CheckUp(name, card);
		
	}
	



}
