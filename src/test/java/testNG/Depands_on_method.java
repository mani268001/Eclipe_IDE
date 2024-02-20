package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depands_on_method {
	
	WebDriver driver;
  @Test(dependsOnMethods = "login")
  public void f() {
	  System.out.println("Manikutty");
  }

  @Test
  public void login() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	  
	 
  }
}
