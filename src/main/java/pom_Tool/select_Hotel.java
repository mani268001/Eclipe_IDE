package pom_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_Hotel {
	
	public WebDriver driver;

	public select_Hotel(WebDriver driver1) {

		driver = driver1;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="check_all")
	private WebElement check_all;
	
	public WebElement getcheck_all() {
		return check_all;
	}

	@FindBy(name="cancelall")
	private WebElement cancelall;

	public WebElement getCancelall() {
		return cancelall;
	}

}