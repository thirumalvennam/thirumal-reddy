package groups_sample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class GroupTest {
	WebDriver driver;
  @Test(groups="flower")
  public void f() {
	  System.out.println("i am rose");
  }
  @Test(groups="fruit")
  public void g() {
	  System.out.println("i am apple ");
  }
  @Test(groups="flower")
  public void h() {
	  System.out.println("i am lilly");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
