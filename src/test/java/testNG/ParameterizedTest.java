package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
  @Test
  @Parameters({"name","age"})
  public void f(String name,String age) {
	  System.out.println("Enter your name:-"+name);
	  System.out.println("Enter your age:-"+age);
  }
}
