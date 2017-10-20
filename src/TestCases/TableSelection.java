/**
 * 
 */
package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;
import PageObject.SignUp_Page;
import PageObject.db_connection;

/**
 * @author Dhruv
 * Mar 4, 2016
 */
public class TableSelection {

	 
	/**
	 * @param args
	 * @throws Exception 
	 */
	private static final Boolean Other_CheckBox = null;
	private static final Boolean AutoReBuy = null;
	private static final Boolean Cancel = null;
	  
	
	public static void main(String[] args) throws Exception 
	{
		BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("abc","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	  
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.Enable_HandStrength(browser.driver); 
	     
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"HandStrength_Enabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
		
	}
    public static void clickElementByLocator(WebDriver driver,String locator) 
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	    driver.findElement(By.xpath(locator)).click();
	}
  } 