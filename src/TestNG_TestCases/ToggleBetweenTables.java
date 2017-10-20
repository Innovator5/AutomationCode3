package TestNG_TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;

public class ToggleBetweenTables {
  @Test
  public void f() throws IOException {
      
   	     BrowserPage browser = new BrowserPage();
 	     browser.BrowserName("Firefox");
	     
	     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
	     p.WaitForElement(browser.driver,"usernameIn","", "","");
	     p.Login("abc","a");
	     
	     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
	     ScreenShot shot = PageFactory.initElements(browser.driver,ScreenShot.class);
	     
	     page.SelectGame(browser.driver,"FreeRoll","Sprint"); 
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     shot.TakeScreenShot(browser.driver,"Firefox_AfterClicking_FreeRoll_Sprint 1");
	     
	     page.SelectGame(browser.driver,"REAL","Omaha"); 
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     shot.TakeScreenShot(browser.driver,"Firefox_AfterClicking_Real_Omaha");
	     
	     page.SelectGame(browser.driver,"SNG",""); 
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     shot.TakeScreenShot(browser.driver,"Firefox_AfterClicking_SNG");
	     
	     page.SelectGame(browser.driver,"FreeRoll","Omaha"); 
	     p.WaitForElement(browser.driver,"","view_Players ","","");
	     shot.TakeScreenShot(browser.driver,"Firefox_AfterClicking_FreeRoll_Omaha");
	     
	     browser.CloseBrowser();      

  }
}
