package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class3 {
  @Test(priority = 1)
      public void C3M1() {
	    System.out.println("C3.first method");
	    Assert.assertEquals("a", "a");  
  }
  @Test(priority = 2)
      public void C3M2() {
	    System.out.println("C3.Second method");
	    Assert.assertEquals("a", "a"); 
  }
  @Test(priority = 3)
	  public void C3m3() {
		System.out.println("c3.third method");
		Assert.assertEquals("a", "a");  
	  }
  @Test(priority = 4)
	  public void C3M4() {
		System.out.println("c3.fourth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test(priority = 5)
	  public void C3M5() {
		System.out.println(" c3.fifth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test(priority = 6)
      public void C3M6() {
	  System.out.println("c3.sixth method");
	  Assert.assertEquals("a", "a");  
      
  }
}
