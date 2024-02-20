package Amazon_task.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon2 {
	
	private WebDriver driver;
	
	public  Amazon2 (WebDriver driver1) {
		
		driver=driver1;
		
		PageFactory.initElements(driver, this);
	
	
	}
	
	
	
	@FindBy(xpath = "//div[@id='nav-signin-tooltip']")
	private WebElement Account ;

	public WebElement getAccount() {
		return Account;
	}

	@FindBy(id = "ap_email")
	private WebElement ap_email ;

	public WebElement getAp_email() {
		return ap_email;
	}
	
	@FindBy(id = "continue")
	private WebElement Continue	;

	public WebElement getContinue() {
		return Continue;
	}
	
	@FindBy(id = "ap_password")
	private WebElement ap_password;

	public WebElement getAp_password() {
		return ap_password;
	}	
		
	@FindBy(id = "signInSubmit")                
	private WebElement signInSubmit;
	public WebElement getSignInSubmit() {                       
		return signInSubmit;
	}
/*	
	@FindBy(partialLinkText = "Mobiles")
	private WebElement 	Mobiles;	
	public WebElement getMobiles() {                        
		return Mobiles;
	}
	@FindBy(xpath = "(//li[@role='presentation'])[2]")
	private WebElement Accessories;
	public WebElement getAccessories() {
		return Accessories;
	}
	
	@FindBy(xpath = "//div[@id='nav-search-dropdown-card']")
	private WebElement Dropdowen;
	public WebElement getDropdowen() {                  
		return Dropdowen;
	}
	*/                                    //div[@class='nav-search-field ']      Serchbox               
	
	@FindBy(xpath = "//input[@placeholder='Search Amazon.in']")
	private WebElement Serchbox;
	public WebElement getSerchbox() {
		return Serchbox;
	}
	
	@FindBy(xpath = "//*[text()='boat airdopes genesis bluetooth v5.3']")
	private WebElement  boatv53_1;
	public WebElement getBoatv53_1() {                              // boAt Bluetooth v5.3   -----1
		return boatv53_1;
	} 
	
	
	
	@FindBy(xpath = "//*[@id=\"a-autoid-3-announce\"]")
	private WebElement Add_to_cart;
	public WebElement getAdd_to_cart() {
		return Add_to_cart;
	}
	@FindBy(xpath = "//*[text()='truke Buds s1']")             
	private WebElement  trukes1_2;                                   //  truke Buds s1	--------2                                                              	
	public WebElement getTrukes1_2() {
		return trukes1_2;
	}

	@FindBy(xpath="(//*[@class='a-section s-atc-content aok-inline-block'])[5]"	)
	private WebElement cart2;
	public WebElement getCart2() {
		return cart2;
	}
	
	@FindBy(xpath = "//*[text()='ptron bassbuds duo in-ear bluetooth 5.1']")             
	private WebElement  pTron_3;                    //  ptron bassbuds duo in-ear bluetooth 5.1	---3                                                              	
	public WebElement getpTron_3() {
		return pTron_3;
	}
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[10]")
	private WebElement pTron3_cart;
	public WebElement getpTron3_cart() {
		return pTron3_cart;
	}
	                                              
	
	@FindBy(xpath = "//*[text()='lava probuds n31 neckband']")             
	private WebElement Lava4;                  //  lava probuds n31 neckband-------4	                                                              	
	public WebElement getLava4() {
		return Lava4;
	}
	
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	private WebElement Lava_cart;
	public WebElement getLava_cart() {
		return Lava_cart;
			}	
	
	@FindBy(xpath = "//*[text()='oppo A78 5g back cover']")             
	private WebElement oppoA78;                  //  oppo A78 5g back cover-------5	                                                              	
	public WebElement getOppoA78() {
		return oppoA78;
	}
	@FindBy(xpath="(//span[@class='a-button-inner'])[4]")
	private WebElement oppo_cart;
	public WebElement getOppo_cart() {
		return oppo_cart;
	}
	
	@FindBy(xpath = "//*[text()='samsung a53 screen guard']")             
	private WebElement samsung;                  //  samsung a53 screen guard-------6	                                                              	
	public WebElement getSamsung() {
		return samsung;
	}
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[4]")
	private WebElement samsung_cart;
	public WebElement getSamsung_cart() {
		return samsung_cart;
	}
	@FindBy(xpath = "//*[text()='acwo dwots 323 earbuds']")             
	private WebElement acwo;                  // acwo dwots 323 earbuds-------7	                                                              	
	public WebElement getAcwo() {
		return acwo;
	}
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[5]")
	private WebElement acwo_cart;
	public WebElement getAcwo_cart() {
		return acwo_cart;
	}
	
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	private WebElement ALL_cart;
	public WebElement getALL_cart() {
		return ALL_cart;
			}
	@FindBy(xpath = "//*[@value='Delete']")
	private WebElement Delete;

	public WebElement getDelete() {
		return Delete;
	}
	
}
