package testNG;

import org.testng.annotations.Test;

import baseclass.org.Baseclass;

public class Invocation extends Baseclass {

	@Test(invocationCount = 3) // --------------many more time forfom the same cord invocation
	public void f() {
		browser_Launch("Chrome");
		url("https://adactinhotelapp.com/");

		implicitlywait(2000);
	}

	@Test(invocationCount = 2)
	public void f1() {
		System.out.println("Manikutty");
	}

	// please don't run the class 

}
