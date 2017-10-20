package TestNG_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.BrowserConfigurationOptions;

import PageObject.BrowserPage;
import PageObject.LogIn_Page;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Login {
    
	BrowserPage browser = new BrowserPage();
	
	@BeforeMethod
  public void beforeMethod() {
    
  }
  @Test(priority = 1)
  public void a() {
	  browser.BrowserName("chrome");
	  
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("rudi", "a");
	  page.WaitForElement(browser.driver,"logout_Button","","","");
	  page.LogOut();
	
	  browser.CloseBrowser();
  }
  
  @Test(priority= 2)
  public void b(){
	  browser.BrowserName("firefox");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","","");
	  page.Login("abc","a");
	  page.WaitForElement(browser.driver,"logout_Button","","","");
	  page.LogOut();
	  browser.CloseBrowser();
	  
  }
  
  /*
  @Test(priority = 3)
  public void c(){
	  browser.BrowserName("safari");
	  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
	  page.WaitForElement(browser.driver,"usernameIn","","");
	  page.Login("abc","a");
	  page.WaitForElement(browser.driver,"logout_Button","","");
	  page.LogOut();
	  browser.CloseBrowser();
	  
  }
  */
  
  @AfterMethod
  public void afterMethod() {
	//  browser.CloseBrowser();
  }

}
