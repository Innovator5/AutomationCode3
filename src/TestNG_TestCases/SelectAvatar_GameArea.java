package TestNG_TestCases;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.db_connection;

public class SelectAvatar_GameArea {
  @Test
  public void f() throws ClassNotFoundException, SQLException 
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
     
     GameArea_Page o = PageFactory.initElements(browser.driver, GameArea_Page.class);
     o.Choose_Avatar(browser.driver,25);
     
  }
}
