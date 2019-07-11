package Interview_topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverMultiple {

	public static void main(String[] args) throws Exception {
		 WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.get("https://www.softwaretestingmaterial.com/mouse-hover-actions-using-selenium/");
			WebElement element1=driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]"));
			WebElement element2=driver.findElement(By.xpath("//a[@href='https://www.softwaretestingmaterial.com/selenium-tutorial/']//span[contains(text(),'Selenium')]"));
			WebElement element3=driver.findElement(By.xpath("//a[@href='https://www.softwaretestingmaterial.com/testng-tutorial/']//span[contains(text(),'TestNG')]"));
			Actions action = new Actions (driver);
			Thread.sleep(3000);
			action.moveToElement(element1).build().perform();
			action.moveToElement(element2).build().perform();
			action.moveToElement(element3).build().perform();
			element3.click();
		
	}

}
