package amazon.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_demo {
	private WebDriver driver;
	public Amazon_demo(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver1, this);			
	}
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[6]")
	private WebElement  mobile; 

	public WebElement getMobile() {
		return mobile;
	}
	@FindBy(id = "sobe_d_b_14_1")
	private WebElement iphone;

	public WebElement getIphone() {
		return iphone;
	}
	 @FindBy (xpath = "(//input[@title='Add to Shopping Cart'])[2]")
	private WebElement cart_iphone;

	public WebElement getCart_iphone() {
		return cart_iphone;
	}
	@FindBy(id = "attach-close_sideSheet-link")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}
	@FindBy(id = "sobe_d_b_14_2")
	private WebElement oneplus;
	public WebElement getOneplus() {
		return oneplus;
	}
	@FindBy(id = "sobe_d_b_14_3")
	private WebElement IQOO;
	public WebElement getIQOO() {
		return IQOO;
	}
	@FindBy(id = "sobe_d_b_14_4")
	private WebElement oneplus_11_R;
	public WebElement getOneplus_11_R() {
		return oneplus_11_R;
	}
	@FindBy(id = "sobe_d_b_14_5")
	private WebElement HONOR;
	public WebElement getHONOR() {
		return HONOR;
	}
	@FindBy(id = "nav-cart")
	private WebElement allcart;
	public WebElement getAllcart() {
		return allcart;
	}
	@FindBy(partialLinkText = "Home")
	private WebElement Home;
	public WebElement getHome() {
		return Home;
	}
		
	
}
