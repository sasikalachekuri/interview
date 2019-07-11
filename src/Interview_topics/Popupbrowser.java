package Interview_topics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupbrowser {

	public static void main(String[] args) throws Throwable {
	    WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.amazon.com/Dell-Latitude-i5-7200U-Certified-Refurbished/dp/B07FRJP3D9/ref=sr_1_4?s=pc&ie=UTF8&qid=1549660502&sr=1-4&keywords=dell+latitude+7480+laptop");
	
	//	driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(9000);
		WebElement ele=driver.findElement(By.linkText("//input[@id='add-to-cart-button']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", ele);
    	driver.findElement(By.linkText("//input[@title='Add to Shopping Cart']")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String ParentWindow=it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
