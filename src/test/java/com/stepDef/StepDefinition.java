package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinition {

	public static WebDriver driver;
		
	
	
@Given("User launch the browser")
public void user_launch_the_browser() {
  WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");

}
@When("User enter username as {string}")
public void user_enter_username_as(String username) {
	driver.findElement(By.name("username")).sendKeys(username);
	
}
   
@When("User enter the password as {string}")
public void user_enter_the_password_as(String psw) {
	driver.findElement(By.name("password")).sendKeys(psw);
   	
}
@When("User click on the login button")
public void user_click_on_the_login_button() {
  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}

@Then("User should navigate to the dashboard")
public void user_should_navigate_to_the_dashboard() {
	String actual = driver.getCurrentUrl();
	String exp="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	Assert.assertEquals(exp, actual);
	
   
}


}
