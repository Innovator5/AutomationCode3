/**
 * 
 */
package TestCases;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.unix.X11.Screen;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;

/**
 * @author Dhruv
 * Mar 22, 2016
 */
class test {

	private static final Boolean Other_CheckBox = null;
	private static final Boolean AutoReBuy = null;
	private static final Boolean Cancel = null;
 
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception 
	{
		 BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("abc","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     p.WaitForElement(browser.driver,"expViewBtn","","","");
	     page.View_TableList("List");
	     
	     List<WebElement> HeaderData = browser.driver.findElements(By.className("tablesorter-header-inner"));
	    	 for (int i= 0; i<HeaderData.size()-1 ;i++)
	    	 {
	    		 String a = browser.driver.findElement(By.className("tablesorter-header-inner")).getText();
	             System.out.println(a); 
	    	 }
	     
	    }
}

