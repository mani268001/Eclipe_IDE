package testNG;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.org.Baseclass;
import pom_Tool.login_page;

public class simpul_method extends Baseclass {
	@Test
	public void f() {
		implicitlywait(2000);
		try {
			Screenshot("TestNG fast test");
		} catch (IOException e) {
			System.out.println("$$$$");
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void beforeClass() {
		login_page lp = new login_page(driver);
		Click(lp.getLogin());
	}
	@BeforeTest
	public void beforeTest() {
		login_page lp = new login_page(driver);
		sendkeys(lp.getUsername(), "Bassclass2001");
		sendkeys(lp.getPassword(), "bassclass@2001");
	}
	@BeforeSuite
	public void beforeSuite() {
		browser_Launch("Chrome");
		url("https://adactinhotelapp.com/");

	}

}
