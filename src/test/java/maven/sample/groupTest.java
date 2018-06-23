package maven.sample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class groupTest {
	WebDriver driver;
  @Test(groups="flavour")
  public void f() {
	  System.out.println("i am venella");
	   }
 @Test(groups="flavour")
public void g() {
	  System.out.println("i am icecream");
 }
 @Test(groups="fruits")
public void h() {
	  System.out.println("i am grape");
 }
}