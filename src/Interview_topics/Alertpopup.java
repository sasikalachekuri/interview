package Interview_topics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alertpopup {
@Test
public void alertpopupmethod(){
	
		  WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			Alert al = driver.switchTo().alert();
			String actual =al.getText();
			al.accept();
			
			Assert.assertEquals(actual,"Please enter a valid user name");
			driver.close();
			
			
			
			
}
}
