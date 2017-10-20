/**
 * 
 */
package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;

/**
 * @author Dhruv
 * Apr 12, 2016
 */
public class ControlPanel {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, Exception 
	{
		 BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("rudi","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 64");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	     page.TakeSeat(browser.driver,"Texas Short", 5);
	     //page.TakeSeat(browser.driver,"Texas Short", 5);
		     
		 //------ Hand History----------
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.click_DealerChat(browser.driver);
	     
	     ScreenShot t = PageFactory.initElements(browser.driver,ScreenShot.class);
	     
	     //==============Add UserName in the screenshot so that validation make sense.
	     t.TakeScreenShot(browser.driver,"Verify_DealerChat");
	     
	     //========Reporting Issues==================================================  
	     o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	     o.click_Report_issue(browser.driver,"Issue is not being reported","no");  
	         //====no more than 3 issues per session
	         o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	         o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	         o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	         // Assertion of no more than 3 issue can be reported
	      
	     //========STATS=================================================================
	         
	         
	         
           
	
	}
		
	}


