/**
 * 
 */
package Mobile_PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Dhruv
 * Mar 14, 2016
 */
public class NativeBrowser_Login 
{

	/**
	 * @param args
	 */
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException 
	{
//     	DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
//	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Asus");
//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Browser");
//	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
	    driver.get("http://192.168.2.202/playpoker/#lobby");
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

}
