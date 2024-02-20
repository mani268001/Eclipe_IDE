package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallerTest {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
  }
  @Test
  public void f2() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
  }
}
