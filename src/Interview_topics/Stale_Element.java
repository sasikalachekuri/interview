package Interview_topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stale_Element {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.readinga-z.com/");
	    WebElement	link = driver.findElement(By.xpath("//a[@class='floatL']"));
		link.click();
		driver.navigate().back();
//		link.click();
		
		try{
		    link.click();
		}catch(StaleElementReferenceException e)
		{
			link = driver.findElement(By.xpath("//a[@class='floatL']"));
			link.click();
		}
		
		
		

	}
//	 public void webdriverwait(WebDriver dr,){
//		 WebDriverWait wait = new WebDriverWait(null, 0);
//		 wait.
		 
//	 }

}
