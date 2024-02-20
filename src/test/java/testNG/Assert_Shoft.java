package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Shoft {
  @Test
  public void f1() {
	  String s1="Manikutty";
	  String s2="mANIKUTTY";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(s1, s2);
	  
  }
  
  @Test
  public void f2() {
	  String s1="Manikutty";
	  String s2="Manikutty";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(s1, s2);
	  
  }
}
