/**
 * 
 */
package PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


/**
 * @author Dhruv
 * Mar 9, 2016
 */
public class ScreenShot {

	public void TakeScreenShot(WebDriver d, String FileName) throws IOException
	{
		File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\tmp\\"+FileName+"screenshot.png"));
    }

 }

