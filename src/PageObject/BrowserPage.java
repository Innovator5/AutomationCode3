package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BrowserPage {
	public WebDriver driver;
	
public void BrowserName(String browser) {
	 
	  if(browser.equalsIgnoreCase("firefox")) 
	  {
	   driver = new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("chrome")) 
	  { 
		 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver_2.14\\chromedriver.exe");
	      driver = new ChromeDriver();
	   } 
	  else if(browser.equalsIgnoreCase("Safari"))
	  {
	    System.setProperty("webdriver.safari.driver","D:\\selenium-safari\\safari-driver.exe");
	    driver = new SafariDriver();
	  }
	 
	    driver.manage().window().maximize();
	    driver.get("http://192.168.2.212/playpoker/#lobby");
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
      }
       
	  public void CloseBrowser() {
	       
		    this.driver.close();
			this.driver.quit();
		}

}
