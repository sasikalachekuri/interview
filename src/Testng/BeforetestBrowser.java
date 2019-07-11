package Testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforetestBrowser {
	@BeforeTest	
	  public void openbrowser() {
		System.out.println("openbrowser");
		Assert.assertEquals("a", "a");  
	  }
@AfterTest
	  public void closebrowser() {
		System.out.println("closebrowser");
		Assert.assertEquals("a", "a");  
	  }
@Test
public void acutalTest() {
	System.out.println("action");
	Assert.assertEquals("a", "a");  
  }

@BeforeSuite	
public void heading() {
	System.out.println("heading");
	Assert.assertEquals("a", "a");  
}
@AfterSuite
public void report() {
	System.out.println("report");
	Assert.assertEquals("a", "a");  
}
}
