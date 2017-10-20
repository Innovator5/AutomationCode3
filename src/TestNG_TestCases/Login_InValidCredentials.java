package TestNG_TestCases;

import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.LogIn_Page;

import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Login_InValidCredentials {
     
	BrowserPage browser = new BrowserPage();
 
  @Test(priority = 1)
  public void a() 
  {
	browser.BrowserName("firefox");
	LogIn_Page page = PageFactory.initElements(browser.driver, LogIn_Page.class);
    page.WaitForElement(browser.driver,"usernameIn","","","");
    //Valid UserName, InValid Password
    page.Login("ab", "a");
    // Assertion on invalid username
	/*String message = browser.driver.findElement(By.id("loginerror")).getText();
	System.out.println(message);
	Assert.assertEquals("User Name Ab Is Not Recognized", message);
  */
    page.UserName_Error(browser.driver,"ab");
    browser.CloseBrowser();
   }
 
  
  @Test(priority = 2)
  public void b(){
	  browser.BrowserName("firefox");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  
	  page.Login("","");
	  page.UserName_Error(browser.driver,"");
	  
	  browser.CloseBrowser();
    }
  @Test(priority = 3)
  public void c(){
	  browser.BrowserName("firefox");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  browser.CloseBrowser();
    }
  @Test(priority = 4)
  public void d(){
	  browser.BrowserName("firefox");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  browser.CloseBrowser();
    }
  @Test(priority = 5)
  public void e(){
	  browser.BrowserName("firefox");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  
	  browser.CloseBrowser();
    }
  
  @Test(priority = 6)
  public void a1() 
  {
	browser.BrowserName("chrome");
	LogIn_Page page = PageFactory.initElements(browser.driver, LogIn_Page.class);
    page.WaitForElement(browser.driver,"usernameIn","","","");
    page.Login("ab", "a");
    page.UserName_Error(browser.driver,"ab");
    browser.CloseBrowser();
   }
 
  @Test(priority = 7)
  public void b1(){
	  browser.BrowserName("chrome");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("","");
	  page.UserName_Error(browser.driver,"");
	  browser.CloseBrowser();
    }
  @Test(priority = 8)
  public void c1(){
	  browser.BrowserName("chrome");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  browser.CloseBrowser();
    }
  @Test(priority = 9)
  public void d1(){
	  browser.BrowserName("chrome");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  browser.CloseBrowser();
    }
  @Test(priority = 10)
  public void e1(){
	  browser.BrowserName("chrome");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  
	  page.Login("ab","a");
	  page.UserName_Error(browser.driver,"ab");
	  
	  browser.CloseBrowser();
    }

  

}
