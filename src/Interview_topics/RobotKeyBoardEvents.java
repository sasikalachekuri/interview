package Interview_topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotKeyBoardEvents {

	public static void main(String[] args) throws AWTException {
	//	 System.getProperty("webdriver.gecko.driver",
	//				 "C:\\Users\\amrit\\Documents\\workSpace_RS\\SeleniumAutomation\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook/");
		 driver.findElement(By.xpath("//a[contains(text(),'yearly-calendar.xls')]")).click();
		 Robot robo = new Robot();
		 robo.keyPress(KeyEvent.VK_DOWN);
		 robo.keyPress(KeyEvent.VK_TAB);
		 robo.keyPress(KeyEvent.VK_TAB);
		 robo.keyPress(KeyEvent.VK_TAB);
		 robo.keyPress(KeyEvent.VK_ENTER);
	}

}
