package TestNG_TestCases;

import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.SignUp_Page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SignUp {
       BrowserPage browser = new BrowserPage();

  @Test(priority = 1)
  public void a() {
	  browser.BrowserName("firefox");
	  SignUp_Page page = new SignUp_Page();
	  page.SignUp_Form("chrome","ADDA", "ADDA52", "gaussnetworks@gmail.com", "Male");
	  
	  page.SignUpPage_UserName_ErrorMessage();
	  page.SignUpPage_Password_ErrorMessage();
	  page.SignUpPage_GenderErrorMessage();
	  page.SignUpPage_Email_ErrorMessage();
      browser.CloseBrowser();
  }
  @Test(priority = 2)
  public void b() {
	  browser.BrowserName("chrome");
	  SignUp_Page page = new SignUp_Page();
	  page.SignUp_Form("firefox","52ADDA", "ADDA52", "gaussnetworks@gmail.com", "Male");
	  
	  page.SignUpPage_UserName_ErrorMessage();
	  page.SignUpPage_Password_ErrorMessage();
	  page.SignUpPage_GenderErrorMessage();
	  page.SignUpPage_Email_ErrorMessage();
      browser.CloseBrowser();
  }
}
/*  @Test(priority = 3)
  public void c() {
	  browser.BrowserName("safari");
	  SignUp_Page page = new SignUp_Page();
	  page.SignUp_Form("AD52DA", "ADDA52", "gaussnetworks@gmail.com", "female");
	  page.SignUpPage_UserName_ErrorMessage();
	  page.SignUpPage_Password_ErrorMessage();
	  page.SignUpPage_GenderErrorMessage();
	  page.SignUpPage_Email_ErrorMessage();
      browser.CloseBrowser();
  }
 */ 
