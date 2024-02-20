package pom_Tool;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Tool {
	
	

	@FindBy(partialLinkText="ForgotPassword")
	private WebElement ForgotPassword;
	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
	@FindBy(id="emailadd_recovery")
	private WebElement emailadd_recovery;	
	public WebElement getEmailadd_recovery() {
		return emailadd_recovery;
	}
	@FindBy(id="Submit")
	private WebElement Submit;	
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(id="Reset")
	private WebElement Reset;
	public WebElement getReset() {
		return Reset;
	}
	@FindBy(partialLinkText="DOWNLOAD")
	private WebElement DOWNLOAD;
	public WebElement getDOWNLOAD() {
		return DOWNLOAD;
	}
	@FindBy(xpath="Click")
	private WebElement Click;
	public WebElement getClick() {
		return Click;
	}
	@FindBy(partialLinkText="Go back to Login page")
	private WebElement Go_back_to_Login_page  ;
	public WebElement getGo_back_to_Login_page() {
		return Go_back_to_Login_page;
	}
	@FindBy(partialLinkText="New User Register Here")
	private WebElement New_User_Register_Here;
	public WebElement getNew_User_Register_Here() {
		return New_User_Register_Here;
	}
	@FindBy(id="re_password")
	private WebElement re_password;
	public WebElement getRe_password() {
		return re_password;
	}
	@FindBy(id="full_name")
	private WebElement full_name;
	public WebElement getFull_name() {
		return full_name;
	}
	@FindBy(name="email_add")
	private WebElement email_add;
	public WebElement getEmail_add() {
		return email_add;
	}
	@FindBy(xpath="Refresh Captcha")
	private WebElement Refresh_Captcha;
	public WebElement getRefresh_Captcha() {
		return Refresh_Captcha;
	}
	@FindBy(name="captcha")
	private WebElement captcha;
	public WebElement getCaptcha() {
		return captcha;
	}
	@FindBy(id="tnc_box")
	private WebElement tnc_box;
	public WebElement getTnc_box() {
		return tnc_box;
	}
	@FindBy(xpath="Terms_Conditions")
	private WebElement Terms_Conditions;
	public WebElement getTerms_Conditions() {
		return Terms_Conditions;
	}
	@FindBy(xpath="Register")
	private WebElement Register;
	public WebElement getRegister() {
		return Register;
	}
	@FindBy(partialLinkText="Go_to_Build_2")
	private WebElement Go_to_Build_2 ;
	public WebElement getGo_to_Build_2() {                                  //partialLinkText
		return Go_to_Build_2;
	}
	@FindBy(partialLinkText="info@adactin.com")
	private WebElement info_adactin_com;
	public WebElement getInfo_adactin_com() {
		return info_adactin_com;
	}
	@FindBy(partialLinkText="Adactin.com")
	private WebElement Adactin_com;
	public WebElement getAdactin_com() {
		return Adactin_com;
	}
	
	
	@FindBy(partialLinkText="Booked Itinerary")
	private WebElement Booked_Itinerary;
	public WebElement getBooked_Itinerary() {
		return Booked_Itinerary;
	}
	@FindBy(partialLinkText="Change Password")
	private WebElement Change_Password;
	public WebElement getChange_Password() {
		return Change_Password;
	}
	@FindBy(partialLinkText="Logout")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	@FindBy(xpath="Continue")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}

	@FindBy(id="cancel")
	private WebElement cancel;
	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(partialLinkText="Back")
	private WebElement Back;
	public WebElement getBack() {
		return Back;
	}
	@FindBy(id="search_hotel")
	private WebElement search_hotel;
	public WebElement getSearch_hotel() {
		return search_hotel;
	}
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;
	
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	@FindBy(id="order_id_text")
	private WebElement order_id_text;
	public WebElement getOrder_id_text() {
		return order_id_text;
	}
	@FindBy(id="check_all")
	private WebElement check_all;
	public WebElement getCheck_all() {
		return check_all;
	}
	
	@FindBy(xpath="checkbox")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(name="cancelall")
	private WebElement cancelall;
	public WebElement getCancelall() {
		return cancelall;
	}
	
	@FindBy(xpath="Search Hotel")
	private WebElement Search_Hotel;
	public WebElement getSearch_Hotel() {
		return Search_Hotel;	
	}
/*	
	@FindBy(id="username")
	private WebElement username ;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(name="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	} 	
	@FindBy(name="login")
	private WebElement login ;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	@FindBy(id="room_type")
	private WebElement room_type;
	public WebElement getRoom_type() {
		return room_type;
	}
	@FindBy(id="room_nos")
	private WebElement room_nos;
	public WebElement getRoom_nos() {
		return room_nos;
	}
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	@FindBy(id="adult_room")
	private WebElement adult_room;
	public WebElement getAdult_room() {
		return adult_room;
	}
	@FindBy(id="child_room")
	private WebElement child_room;
	public WebElement getChild_room() {
		return child_room;
	}
	@FindBy(className="reg_button")
	private WebElement reg_button;
	public WebElement getReg_button() {
		return reg_button;
	}
	@FindBy(name="first_name")
	private WebElement first_name;
	public WebElement getFirst_name() {
		return first_name;
	}
	@FindBy(name="last_name")
	private WebElement last_name;
	public WebElement getLast_name() {
		return last_name;
	}
	@FindBy(id="address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="cc_num")
	private WebElement cc_num;
	public WebElement getCc_num() {
		return cc_num;
	}
	@FindBy(id="cc_type")
	private WebElement cc_type;
	public WebElement getCc_type() {
		return cc_type;
	}
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	@FindBy(id="book_now")
	private WebElement book_now;
	public WebElement getBook_now() {
		return book_now;}
*/	
}
