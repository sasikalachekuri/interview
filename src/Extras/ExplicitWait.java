package Extras;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://www.pavantestingtools.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//ul[@class='menupbt nav-menu']//a[contains(text(),'Training')]"));
		ele.click();
		
		driver.navigate().back();
		explicitwait(driver, ele, 40);
	//	ele.click();
		

	}
	
	
	public static void explicitwait(WebDriver driver, WebElement ele, int timeout){
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

}
