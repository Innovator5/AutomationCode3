package TestNG_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.BrowserPage;
import PageObject.SignUp_Page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SignUp_InValidCredentials {
      BrowserPage browser = new BrowserPage();
@BeforeMethod
  public void beforeMethod() {
  }
@Test(priority =1)
  public void SignUp_Invalid_UserName() {
	  SignUp_Page page = new SignUp_Page();
	  page.SignUp_Form("firefox","InvalidUserNamePlayerADDA52", "ADDA52", "gaussnetworks@gmail.com", "Male");
	  // UserName Validation
		page.SignUpPage_UserName_ErrorMessage();
		page.SignUpPage_Password_ErrorMessage();
		page.SignUpPage_Email_ErrorMessage();
		page.SignUpPage_GenderErrorMessage();
		page.SignUp_Close();
 }

@Test(priority =2)
  public void SignUp_Invalid_Password() 
     {
	     SignUp_Page page = new SignUp_Page();
	    page.SignUp_Form("firefox","ADDA", "InValidPasordForTheUserof_ADDA23", "abc@xyz.com", "female");
		page.SignUpPage_Email_ErrorMessage();
		page.SignUpPage_GenderErrorMessage();
		page.SignUpPage_Password_ErrorMessage();
		page.SignUpPage_UserName_ErrorMessage();
		page.SignUp_Close();
     }
  
@Test(priority = 3)
public static void SignUp_Invalid_Email(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("firefox", "ADDA","adada12321","InvakidEmail","Male");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
@Test(priority = 4)
public static void SignUp_Invalid_Gender(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("firefox","Adda52","Adda323131","Adad@gmail.com","Gender");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
@Test(priority = 5)
public static void SignUp_BlankDetail(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("firefox","", "","","");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
@Test(priority =6)
public void chrome_SignUp_Invalid_UserName() {
	  SignUp_Page page = new SignUp_Page();
	  page.SignUp_Form("chrome","InvalidUserNamePlayerADDA52", "ADDA52", "gaussnetworks@gmail.com", "Male");
	  // UserName Validation
		page.SignUpPage_UserName_ErrorMessage();
		page.SignUpPage_Password_ErrorMessage();
		page.SignUpPage_Email_ErrorMessage();
		page.SignUpPage_GenderErrorMessage();
		page.SignUp_Close();
}

@Test(priority =7)
public void chrome_SignUp_Invalid_Password() 
   {
	     SignUp_Page page = new SignUp_Page();
	    page.SignUp_Form("chrome","ADDA", "InValidPasordForTheUserof_ADDA23", "abc@xyz.com", "female");
		page.SignUpPage_Email_ErrorMessage();
		page.SignUpPage_GenderErrorMessage();
		page.SignUpPage_Password_ErrorMessage();
		page.SignUpPage_UserName_ErrorMessage();
		page.SignUp_Close();
   }

@Test(priority = 8)
public static void chrome_SignUp_Invalid_Email(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("chrome", "ADDA","adada12321","InvakidEmail","Male");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
@Test(priority = 9)
public static void chrome_SignUp_Invalid_Gender(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("chrome","Adda52","Adda323131","Adad@gmail.com","Gender");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
@Test(priority = 10)
public static void chrome_SignUp_BlankDetail(){
	SignUp_Page page = new SignUp_Page();
	page.SignUp_Form("chrome","", "","","");
	page.SignUpPage_Email_ErrorMessage();
	page.SignUpPage_GenderErrorMessage();
	page.SignUpPage_Password_ErrorMessage();
	page.SignUpPage_UserName_ErrorMessage();
	page.SignUp_Close();
}
 
  
}