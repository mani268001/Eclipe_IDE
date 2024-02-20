package pom_Tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_comfimation {

	public WebDriver driver;

	public Booking_comfimation(WebDriver driver1) {

		driver = driver1;

		PageFactory.initElements(driver, this);
	}

	@FindBy( partialLinkText= "Booked Itinerary")
	private WebElement Booked_Itinerary;

	public WebElement getBooked_Itinerary() {
		return Booked_Itinerary;
	}
    
	
}
