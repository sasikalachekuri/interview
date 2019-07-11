package Interview_topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
      //FirefoxOptions options = new FirefoxOptions();
	//  HtmlUnitDriver driver = new HtmlUnitDriver();//Download Selenium jars from selenium hq wesite
	  WebDriver driver = new ChromeDriver();
	  
//		ChromeOptions options = new ChromeOptions();
	//	options.setHeadless(true);
		
	//	WebDriver driver = new ChromeDriver(options);
//	    

//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("Ps4");
		
	}

}
