package pom_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page  {
	
	public WebDriver driver; 
	
  public login_page(WebDriver driver1) {
		
		driver=	driver1;
		
	PageFactory.initElements(driver, this);
	}
  
  
  
  @FindBy(id="username")
   private WebElement username ;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	} 	
	@FindBy(name="login")
	private WebElement login ;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(partialLinkText="ForgotPassword")
	private WebElement ForgotPassword;
	
	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
}
