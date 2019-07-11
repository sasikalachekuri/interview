package Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
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
      @Test(priority =1)
      public void C1M1() {
	    System.out.println("C1.first method");
	    Assert.assertEquals("a", "a");  
  }
  @Test(priority =2)
      public void C1M2() {
	    System.out.println("C1.Second method");
	    Assert.assertEquals("a", "a"); 
  }
  @Test(priority =3)
	  public void C1M3() {
		System.out.println("c1.third method");
		Assert.assertEquals("a", "a");  
	  }
  @Test(priority =4)
	  public void C1M4() {
		System.out.println("c1.fourth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
	  public void C1M5() {
		System.out.println(" c1.fifth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
      public void C1M6() {
	  System.out.println("c1.sixth method");
	  Assert.assertEquals("a", "a");  
      
  }
}
