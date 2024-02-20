package pom_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
 
	public WebDriver driver; 
	
	  public Booked_Itinerary(WebDriver driver1) {
			
			driver=	driver1;
			
		PageFactory.initElements(driver, this);
		}
	
	  @FindBy(name="radiobutton_0")
	private WebElement radiobutton_0;
	
	public WebElement getradiobutton_0() {
		return radiobutton_0;
	}
	@FindBy(id="continue")
	private WebElement Continue ;

	public WebElement getContinue() {
		return Continue;
	}
}
