package Extras;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEXpath {

	public static void main(String[] args) throws Throwable {
		  WebDriver driver;
		  
		   DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//		   cap.setCapability(CapabilityType.BROWSER_NAME, "IE");
		   cap.setCapability(InternetExplorerDriver.
		     INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		   cap.setCapability("ignoreProtectedModeSettings", true);
			driver = new InternetExplorerDriver(cap);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.get("https://wordpress.com/");
			Thread.sleep(3000);
			WebElement ele =driver.findElement(By.xpath("//li[@class='x-nav-item x-nav-item--wide x-nav-item--logged-in']//a"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
			

	}

}
