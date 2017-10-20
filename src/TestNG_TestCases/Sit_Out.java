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
import PageObject.ScreenShot;

public class Sit_Out 

{

	private static final Boolean Cancel = null;
    private static final Boolean AutoReBuy = null;
    private static final Boolean Other_CheckBox = null;

@Test
public void Before_Taking_Seat() 
  {
	  BrowserPage browser = new BrowserPage();  
	  browser.BrowserName("Firefox");
      
	  LogIn_Page p1 = PageFactory.initElements(browser.driver,LogIn_Page.class);
      p1.WaitForElement(browser.driver,"usernameIn","", "","");
      p1.Login("dhan","a");
  
      Lobby_Page page1 = PageFactory.initElements(browser.driver,Lobby_Page.class);
      p1.WaitForElement(browser.driver,"expViewBtn","","","");
      page1.View_TableList("List");
      p1.WaitForElement(browser.driver,"","view_Players ","","");
      page1.TableName(browser.driver,"Summer Chase 61");
      
      GameArea_Page o = PageFactory.initElements(browser.driver,GameArea_Page.class);
      o.ExitRoom_WithOut_TakingSeatOnTable();
      p1.LogOut();
      browser.CloseBrowser();
	}
  @Test 
  public void  After_Taking_Seat() throws ClassNotFoundException, Throwable
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
  
     GameArea_Page u = PageFactory.initElements(browser.driver, GameArea_Page.class);
     u.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
     String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
	 System.out.println(a);
	 
	 WebDriverWait wait = new WebDriverWait(browser.driver,30);
	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("infoPopup_Text")));
	 
	 if (a.equalsIgnoreCase("Please wait for another player to join."))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	      else if (a.equalsIgnoreCase("Are you sure you want to exit currently joined room?"))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	      
	 u.Enable_SitOut(browser.driver);
	 u.LeaveSeat();
	 u.ExitRoom_After_TakingSeatOnTable(browser.driver);
	 browser.CloseBrowser();
  }
 @Test 
  public void ClickOn_SitOut_Verify_EnablePopMessage() throws ClassNotFoundException, Exception
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
 
    GameArea_Page u = PageFactory.initElements(browser.driver, GameArea_Page.class);
    u.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
    String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
	 System.out.println(a);
	 
	 WebDriverWait wait = new WebDriverWait(browser.driver,30);
	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("infoPopup_Text")));
	 
	 if (a.equalsIgnoreCase("Please wait for another player to join."))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	      else if (a.equalsIgnoreCase("Are you sure you want to exit currently joined room?"))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	 //====================Verify if the Proper Pop-up Message is Displayed===================
	 
	 WebElement SitOut_Button = browser.driver.findElement(By.cssSelector(".sitOutNextInput.nexthand.checkcont.default_Checkbox"));
	 SitOut_Button.click();
	 
	 String pop_up = browser.driver.findElement(By.className("infoPopup_Text")).getText();
	 if (pop_up.equalsIgnoreCase("Your sitout mode has been enabled for 10 mins."))
	 {
	   WebElement r1 = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	   r1.click();
	 }
	 u.LeaveSeat();
	 u.ExitRoom_After_TakingSeatOnTable(browser.driver);
	 browser.CloseBrowser();
   }
 @Test
 
  public void ClickOn_SitOut_Verify_DisablePopUp() throws ClassNotFoundException, Exception
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
 
    GameArea_Page u = PageFactory.initElements(browser.driver, GameArea_Page.class);
    u.BuyInForm(Other_CheckBox.TRUE,"40000", AutoReBuy.TRUE, Cancel.FALSE);  
    String a = browser.driver.findElement(By.className("infoPopup_Text")).getText();
	 System.out.println(a);
	 
	 WebDriverWait wait = new WebDriverWait(browser.driver,30);
	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("infoPopup_Text")));
	 
	 if (a.equalsIgnoreCase("Please wait for another player to join."))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	      else if (a.equalsIgnoreCase("Are you sure you want to exit currently joined room?"))
	      {
	    	  WebElement r = browser.driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
	    	  r.click();
	      }
	      
	 u.Enable_SitOut(browser.driver);
	 
	 ScreenShot shot1 = PageFactory.initElements(browser.driver, ScreenShot.class);
	 shot1.TakeScreenShot(browser.driver,"I'M BACK Button Visibility");
	 
	 u.LeaveSeat();
	 u.ExitRoom_After_TakingSeatOnTable(browser.driver);
	 browser.CloseBrowser(); 
  }
 }
