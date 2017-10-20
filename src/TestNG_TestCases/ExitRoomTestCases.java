package TestNG_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.GameArea_Page;
import PageObject.Lobby_Page;
import PageObject.LogIn_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitRoomTestCases {

private static final Boolean Other_CheckBox = null;
private static final Boolean AutoReBuy = null;
private static final Boolean Cancel = null;

@Test
 public void ExitRoom_Without_TakingSeat() 
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
 public void ExitRoom_AfterTakingSeat() throws ClassNotFoundException, Exception
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
	      
	 u.Assertion_And_ExitRoom(browser.driver, "Yes");
	 p.LogOut();
	 browser.CloseBrowser();
   }
 @Test
 public void SitOut_Enable_TestCase() throws ClassNotFoundException, Throwable
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
 public void SitOut_Disable_TestCase() throws ClassNotFoundException, Throwable
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
     u.Disable_SitOut(browser.driver); 
	 u.LeaveSeat();
	 u.ExitRoom_After_TakingSeatOnTable(browser.driver);
	 browser.CloseBrowser();
   }
 @Test
 public void AmountReturned_AfterLeavingSeat() throws ClassNotFoundException, Exception
 {
	 BrowserPage browser = new BrowserPage();
     browser.BrowserName("Firefox");
     
     LogIn_Page p = PageFactory.initElements(browser.driver,LogIn_Page.class);
     p.WaitForElement(browser.driver,"usernameIn","", "","");
     p.Login("abc","a");
     
     Lobby_Page page = PageFactory.initElements(browser.driver,Lobby_Page.class);
     page.View_TableList("List");
     p.WaitForElement(browser.driver,"","view_Players ","","");
     
     String A_No_VIPChips =  browser.driver.findElement(By.id("lobbyVIPChips")).getText();
	 int A_VIPCHIPS_value = Integer.parseInt(A_No_VIPChips);
	 System.out.println(A_VIPCHIPS_value);
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
	    u.LeaveSeat();  
	    u.Assertion_And_ExitRoom(browser.driver, "Yes");
	    
	    //p.LogOut();
	         
	    String No_VIPChips =  browser.driver.findElement(By.id("lobbyVIPChips")).getText();
	    int B_VIPCHIPS_value = Integer.parseInt(No_VIPChips);
	    System.out.println(B_VIPCHIPS_value);
	   
	    Assert.assertEquals(A_VIPCHIPS_value,B_VIPCHIPS_value);
		p.LogOut();
	    browser.CloseBrowser();
    }
 } 
 
