package Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
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
      public void C2M1() {
	    System.out.println("C2.first method");
	    Assert.assertEquals("a", "a");  
  }
  @Test
      public void C2M2() {
	    System.out.println("C2.Second method");
	    Assert.assertEquals("a", "a"); 
  }
  @Test
	  public void C2m3() {
		System.out.println("c2.third method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
	  public void C2M4() {
		System.out.println("c2.fourth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
	  public void C2M5() {
		System.out.println(" c2.fifth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
      public void C2M6() {
	  System.out.println("c2.sixth method");
	  Assert.assertEquals("a", "a");  
      
  }
}
