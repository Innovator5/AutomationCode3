package TestNG_TestCases;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;
import PageObject.ScreenShot;

public class Select_Seat {
  @Test
  public void f() throws ClassNotFoundException, SQLException, IOException 
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
      o.ChooseSeat_Preference(browser.driver,4,"Texas Short");
      //o.Choose_Avatar(browser.driver,	27);
//================= ASSERTION BY MAKING USER TAKE DIFFERENT SEAT===================================
      
      WebElement e1 = browser.driver.findElement(By.xpath("//*[@id='seat_1']/div[1]/a"));
      e1.click();
      WebElement e2 = browser.driver.findElement(By.cssSelector(".button.done.buyInFormOk"));
      e2.click();
      WebElement e3 = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
      e3.click(); 
       
      ScreenShot a = PageFactory.initElements(browser.driver, ScreenShot.class);
      a.TakeScreenShot(browser.driver,"Verify Player Sitting on Seat Number 4");
      
      o.LeaveSeat();
      o.ExitRoom_After_TakingSeatOnTable(browser.driver);
      browser.CloseBrowser();
	
      
  }
}
