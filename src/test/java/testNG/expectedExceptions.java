package testNG;




import org.testng.annotations.Test;

public class expectedExceptions {




//@Test(expectedExceptions=NullPointerException  )
  public void f() {
	String s=null;
	 int length = s.length();
	 System.out.println(length);
  }
}
