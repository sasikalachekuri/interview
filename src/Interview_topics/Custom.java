package Interview_topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Custom extends ScreenCapture implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String dir ="FailedScreenShots";
		File fs = new File(dir);
		if (fs.isDirectory()== false){
			fs.mkdir();			
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SrcFile =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+"\\"+dir+"\\"+result+".jpg"));
			System.out.println("Screen shot taken");
		} catch (IOException e) {
		   System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
