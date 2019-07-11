package Interview_topics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	WebDriver driver;
	@Test
	public void Setup(){
		driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.Amazon.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
	
	}

}
