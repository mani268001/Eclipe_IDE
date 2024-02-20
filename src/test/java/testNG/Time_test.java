package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Time_test {
	
  @Test(timeOut = 6000)
  public void f() throws InterruptedException  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://www.facebook.com/");
	 

	  
  }
}
