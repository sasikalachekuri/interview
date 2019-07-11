package Extras;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
	
		 WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.get("https://www.britishairways.com/travel/home/public/en_us");
			
			WebElement link = driver.findElement(By.linkText("Accept"));
			link.click();
			WebElement Discovertab = driver.findElement(By.linkText("Discover"));
			Actions action = new Actions (driver);
			action.moveToElement(Discovertab).build().perform();
			
		  WebElement title = driver.findElement(By.partialLinkText("Vacations by"));
		  title.click();
			System.out.println(driver.getTitle());
			driver.close();
		

	}

}
