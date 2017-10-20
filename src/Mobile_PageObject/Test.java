/**
 * 
 */
package Mobile_PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Dhruv
 * Mar 10, 2016
 */
public class Test {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException 
	{
		
    /*	Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
		m.MobileBrowser("Android","5.0","Asus");

		Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
		f.Mobile_WaitForElement(m.driver,"usernameIn","","");
		f.Mobile_Login("asdsdsadasda", "askdjahsdjhasjkdhaskjdh");
		f.Mobile_UserName_Error(m.driver);
		System.out.println("Test Passed");
	*/
	    Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
	    m.MobileBrowser("Android","5.0","Asus");
        
	    Mobile_LogIn_PageObject page = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
	    page.Mobile_Login("abc","a");
        page.Mobile_WaitForElement(m.driver,"logout_Button","","");
	    
        Mobile_Lobby_PageObject o = PageFactory.initElements(m.driver, Mobile_Lobby_PageObject.class);
        o.Mobile_ClickMenuButton();
        o.Mobile_SelectGame("REAL","Omaha");
        
        page.Mobile_LogOut();
        m.driver.close();
	    m.driver.quit();
	    
	    /*WebDriverWait wait = new WebDriverWait(asd, 50);
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("usernameIn")));
    	*/
	}
  }
