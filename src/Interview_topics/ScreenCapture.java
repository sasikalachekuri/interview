package Interview_topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Custom.class)
public class ScreenCapture {
	

	WebDriver driver;
	@Test
	public void Setup(){
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https:/www.google.com");
	}
	@Test
	public void method1name(){
		Assert.assertEquals(true, false);
	}
	@Test 
	public void method2name(){
//	public void method2name()
		WebDriver driver1= new ChromeDriver();
		String result = "method1name";
		String dir ="FailedScreenShots";
		File fs = new File(dir);
		
		if (fs.isDirectory()== false){
			fs.mkdir();	
			System.out.println("Dir created");
		}
		TakesScreenshot ts = (TakesScreenshot)driver1;
		File SrcFile =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+"\\"+dir+"\\"+result+".jpg"));
			System.out.println("Screen shot taken");
		} catch (IOException e) {
		   System.out.println("error "+e.getMessage());
			e.printStackTrace();
		}
	}
	@Test
	public void TearDown(){
		driver.quit();
	}
	

//	public void Screen(WebDriver driver,String Result) throws IOException{
//		String dir ="FailedScreenShots";
//		File fs = new File(dir);
//		if (fs.isDirectory()== false){
//			fs.mkdir();			
//		}
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File SrcFile =ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+"\\"+dir+"\\"+Result+".jpg"));
//	
//		
//	}

}
