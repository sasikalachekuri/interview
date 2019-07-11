package Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PreAndPostConditions {
 @BeforeClass
	  public void login() {
		System.out.println("login");
		Assert.assertEquals("a", "a");  
	  }
 
 @AfterClass
	  public void logout() {
		System.out.println("logout");
		Assert.assertEquals("a", "a");  
	  }
 @Test
 public void C3M5() {
	System.out.println(" c3.fifth method");
	Assert.assertEquals("a", "a");  
}
}