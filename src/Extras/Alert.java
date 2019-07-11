package Extras;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
	//	driver.findElement(By.cssSelector("body > form:nth-child(9) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(3000);
		Alertmethod(driver);
		Thread.sleep(3000);
		Alertmethod(driver);
		driver.quit();
	}

	public static void Alertmethod(WebDriver driver) {
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();
	}
}

