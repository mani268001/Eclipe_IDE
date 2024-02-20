package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Data_Provider {
  @Test(dataProvider = "dp")
  public void f(String age, String name) {
	  System.out.println("Enter your name"+name);
	  System.out.println("Enter your age"+age);
  }

  @DataProvider
  public Object[][] dp() {
    
      return new Object[][] { {"Mani","28"},{"manikutty","27"},{"Mani","28"},{"manikutty","29"}};
    
  }
}
