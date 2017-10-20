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

import bsh.Capabilities;

/**
 * @author Dhruv
 * Mar 10, 2016
 */
public class Mobile_Browser_PageObject 
{
    	
	public WebDriver driver;
 public  WebDriver MobileBrowser(String PLATFORMNAME,String PLATFORMVERSION,String DEVICENAME) throws MalformedURLException
	{

	 //	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
//	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Asus");
//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        
//	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
	    driver.get("http://192.168.2.202/playpoker/#lobby");
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    return driver;
	
	}
 public void CloseBrowser() {
     
	    this.driver.close();
		this.driver.quit();
	}

		
}

