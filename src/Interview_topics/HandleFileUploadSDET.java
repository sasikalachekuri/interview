package Interview_topics;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadSDET {

	public static void main(String[] args) throws Exception {

		String number = RandomStringUtils.randomNumeric(2);
		System.out.println(number);
		String alpha = RandomStringUtils.randomAlphabetic(2);
		System.out.println(alpha);

		// WebDriver driver;
		// driver = new ChromeDriver();
		// driver.get("https://html.com/input-type-file/");
		// driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/amrit/Desktop/Doubt_Slenium.txt");
		// driver.close();
	}
}
