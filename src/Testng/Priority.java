package Testng;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 4,groups ={"sanity"})
      public void M1() {
	    System.out.println("first method");
	    Assert.assertEquals("a", "a");  
  }
  @Test(priority = 2)
      public void M2() {
	    System.out.println("Second method");
	    Assert.assertEquals("a", "a"); 
  }
  @Test
	  public void m3() {
		System.out.println("third method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
	  public void M4() {
		System.out.println("fourth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
	  public void M5() {
		System.out.println(" fifth method");
		Assert.assertEquals("a", "a");  
	  }
  @Test
      public void M6() {
	  System.out.println("sixth method");
	  Assert.assertEquals("a", "a");  
      
  }
}
