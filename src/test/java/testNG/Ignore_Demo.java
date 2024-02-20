package testNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import baseclass.org.Baseclass;

public class Ignore_Demo extends Baseclass  {
 
	@Test(enabled = false)
  public void click() {
	  
	  System.out.println("manikandani  MBA");
  }
  
  @Test
  public void browser() {
	  browser_Launch("Chrome");
  }
   
  @Test
  @Ignore
  public void login() {
	  System.out.println("manikutttytygh");
  }
 
  @Test
  public void url() {
	  url("https://www.amazon.in/");
	  implicitlywait(2000);
  }
  
  @Test
  public void login2() {
	  
	 driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("redmi");
	 try {
		robot();
	} catch (AWTException e) {
		e.printStackTrace();
	}
	  
  }
  
  
  
  
}
