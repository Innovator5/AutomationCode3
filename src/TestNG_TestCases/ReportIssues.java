package TestNG_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;

public class ReportIssues {

private static final Boolean Other_CheckBox = null;
private static final Boolean AutoReBuy = null;
private static final Boolean Cancel = null;

@Test
  public void ReportIssue_Yes_AfterTakingSeat() throws ClassNotFoundException, Exception 
  {
	     BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("rudi","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	     page.TakeSeat(browser.driver,"Texas Short", 5);
	     
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
	     
	     String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
		 System.out.println(a);
			 
			 if (a.equalsIgnoreCase("Please wait for another player to join."))
		      {
		    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
		    	  r.click();
		      }
		
	     
	     o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	     o.LeaveSeat();
	     o.ExitRoom_After_TakingSeatOnTable(browser.driver);
	     
	     browser.CloseBrowser();
	     }
  @Test
  public void ReportIssue_Yes_WithOut_TakingSeat() throws ClassNotFoundException, Exception 
  {
	     BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("rudi","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	     
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
		 o.click_Report_issue(browser.driver, "Issue is being reported","yes");
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     
	     browser.CloseBrowser();
  }
  
  @Test
  public void ReportIssue_No_AfterTakingSeat() throws ClassNotFoundException, Exception 
  {
	  BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("rudi","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	     page.TakeSeat(browser.driver,"Texas Short", 5);
	     
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
	     
	     String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
		 System.out.println(a);
			 
		 if (a.equalsIgnoreCase("Please wait for another player to join."))
		      {
		    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
		    	  r.click();
		      }
		 o.click_Report_issue(browser.driver, "Issue is being reported","no");
	     o.LeaveSeat();
	     o.ExitRoom_After_TakingSeatOnTable(browser.driver);
	     
	     browser.CloseBrowser();
	     }
  @Test
  public void ReportIssue_No_WithOut_TakingSeat() throws ClassNotFoundException, Exception 
  {
	     BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("rudi","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Texas Short 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	     
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
		 o.click_Report_issue(browser.driver, "Issue is being reported","no");
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     
	     browser.CloseBrowser();
  }
  @Test
  public void ReportIssue_NotMoreThan_3_Issues() throws ClassNotFoundException, Exception
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
	     page.TakeSeat(browser.driver,"Texas Short", 5);
	     
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
	     String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
		 System.out.println(a);
		 
		 if (a.equalsIgnoreCase("Please wait for another player to join."))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	     o.click_Report_issue(browser.driver, "Issue 1 is being reported","yes");
	     o.click_Report_issue(browser.driver, "Issue 2 is being reported","yes");
	     o.click_Report_issue(browser.driver, "Issue 3 is being reported","yes");
	     // o.click_Report_issue(browser.driver, "Issue 4 is being reported","yes");
	     //Report_Issue.click();
		 WebElement e1 = browser.driver.findElement(By.cssSelector(".reportText "));
		 e1.sendKeys("Issue 4 is being reported");
		 WebElement e2 =browser.driver.findElement(By.cssSelector(".reportBtn.report_btn"));
		 e2.click();
         String e3 = browser.driver.findElement(By.className("infoPopup_Text")).getText();
	     
	     if (e3.equalsIgnoreCase("You cannot report more than 3 issues per session."))
	     {
	    	 WebElement e4 = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn "));
	    	 e4.click();
	     }
	     o.LeaveSeat();
	     o.ExitRoom_After_TakingSeatOnTable(browser.driver);
	     browser.CloseBrowser();
    
      }
}
