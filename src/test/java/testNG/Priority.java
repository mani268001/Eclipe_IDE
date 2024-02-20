package testNG;

import org.testng.annotations.Test;

import baseclass.org.Baseclass;
import pom_Tool.Search_Hotel;
import pom_Tool.login_page;

public class Priority extends Baseclass {
  
	    @Test(priority = 5) // -------------------------------- priority
	                             //(-5,-4,-3,-2,-1,=1,2,3,4,5)  the priority order 
	    public void Search_hotel() {
		try {
			Search_Hotel sh = new Search_Hotel(driver);

			
		implicitlywait(2000);
		Selectindex(sh.getLocation(), 6);
		Selectindex(sh.getHotels(), 1);
		Selectindex(sh.getRoom_type(), 3);
		sh.getRoom_nos().sendKeys("2");
		sendkeys(sh.getDatepick_in(), "03/12/2023");
		sendkeys(sh.getDatepick_out(), "04/12/2023");
		sh.getAdult_room().sendKeys("04/12/2023");
		sh.getChild_room().sendKeys("2-Two");
		sh.getSearch().click();
		} catch (Exception e) {
		System.out.println("Manikutty");
		e.printStackTrace();
		}
	}
	    @Test(priority = -1)
	    public void login() {
		login_page lp = new login_page(driver);
		sendkeys(lp.getUsername(), "Bassclass2001");
		sendkeys(lp.getPassword(), "bassclass@2001");
		Click(lp.getLogin());
	}

	    @Test(priority = -4)
	    public void Browser() {

		browser_Launch("Chrome");
		url("https://adactinhotelapp.com/");

		implicitlywait(2000);

	}

}
