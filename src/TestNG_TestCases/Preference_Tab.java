package TestNG_TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;

public class Preference_Tab {
   @Test (priority = 1)
  public void Enable_HandStrength() throws IOException 
  {
	     BrowserPage browser = new BrowserPage();
	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("abc","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     page.View_TableList("List");
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     page.TableName(browser.driver,"Pune Pockets 67");
	     p.WaitForElement(browser.driver,"","exit_button","","");
	  
	     GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
	     o.Enable_HandStrength(browser.driver); 
	     
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"HandStrength_Enabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	}
  @Test (priority = 2)
  public void Disable_HandStrength() throws IOException 
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
	     o.Disable_HandStrength(browser.driver); 
	     
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"HandStrength_Disabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
	}
  @Test (priority = 3)
  public void Enable_MuteGame() throws IOException
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
	     o.Enable_MuteGame(browser.driver);
	     
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"MuteGame_Enabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
    }
  
  @Test (priority = 4)
  public void Disable_MuteGame() throws IOException
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
	     o.Disable_MuteGame(browser.driver);
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"MuteGame_Disabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
    }
  @Test (priority = 5)
  public void Enable_MultiRun() throws IOException
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
	     o.Enable_MultiRun(browser.driver);
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"MultiRun_Enabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
	 }
  @Test (priority = 6)
  public void Disable_MultiRun() throws IOException
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
	     o.Disable_MultiRun(browser.driver);
	     ScreenShot a = PageFactory.initElements(browser.driver,ScreenShot.class);
	     a.TakeScreenShot(browser.driver,"MultiRun_Disabled");
	     
	     o.ExitRoom_WithOut_TakingSeatOnTable();
	     browser.CloseBrowser();
	
	 }
}
