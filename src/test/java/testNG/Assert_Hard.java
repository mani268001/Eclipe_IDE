package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assert_Hard {
  @Test
  public void f1() {
	  String s1="Manikutty";
	  String s2="Manikutty";
	  Assert.assertEquals(s1, s2);
	  
  }
  @Test
  public void f2() {
	  String s1="Manikutty";
	  String s2="mANIKUTTY";
	  Assert.assertEquals(s1, s2);
	  
  }
}
