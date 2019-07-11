package Interview_topics;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframesActionClassJavaExecutor {

	public static void main(String[] args) throws Throwable {
		  WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS );
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.get("https://classic.freecrm.com/index.html?e=1");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("chekurisk");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pass4Pass");
			Thread.sleep(2000);
//-----------------------------------------------------------------------------------
//----------------------Explicit wait----------------------------------------------------
	//		WebDriverWait wait = new WebDriverWait(driver,10);
			
		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-small']")));
//---------------------------------------------------------------------------------------			
			driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
//			Thread.sleep(5000);
//------------------------------------------------------------------------------------
//----------Action class is used because the above x-path is not working------------	
//------------------------------------------------------------------------------------
//			WebElement element = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
//			Actions actions = new Actions(driver);
			
//			actions.moveToElement(element).click().build().perform();
//	   
//------------------------------------------------------------------------------------
//---------------------JavaScriptExecutor IS another Alternate--------------------------------------------
//-------------------------------------------------------------------------------------
//
//	 	 	WebElement element = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
//	 		JavascriptExecutor executor = (JavascriptExecutor)driver;
//	 	 	executor.executeScript("arguments[0].click();", element);	
//			
//------------------------------------------------------------------------------------
//---------------------------------IFrames--------------------------------------------
//------------------------------------------------------------------------------------
//  
			Thread.sleep(3000);
			driver.switchTo().frame(1);
			WebElement ele = driver.findElement(By.xpath("//a[@title='Contacts']"));
		//	JavascriptExecutor executor = (JavascriptExecutor)driver;
	 	 //	executor.executeScript("arguments[0].click();", ele);	
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			driver.findElement(By.linkText("New Contact")).click();
		//	driver.close();

		
	}


	}


