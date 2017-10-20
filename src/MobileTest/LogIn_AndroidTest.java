package MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Mobile_PageObject.Mobile_Browser_PageObject;
import Mobile_PageObject.Mobile_LogIn_PageObject;
import java.net.MalformedURLException;

public class LogIn_AndroidTest {

	@Test(priority = 1)
       public void Android_UserName_Password() throws MalformedURLException 
    {
		Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
		m.MobileBrowser("Android","5.0","Asus");
		Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
		f.Mobile_WaitForElement(m.driver,"usernameIn","","");
		f.Mobile_Login("asdsdsadasda", "askdjahsdjhasjkdhaskjdh");
		f.Mobile_UserName_Error(m.driver);
		m.CloseBrowser();
		
	}
	@Test(priority = 2)
	  public void Android_Invalid_Username() throws MalformedURLException 
	    {
			Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
			m.MobileBrowser("Android","5.0","Asus");
			Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
			f.Mobile_WaitForElement(m.driver,"usernameIn","","");
			f.Mobile_Login("asdsdsadasda", "a");
			f.Mobile_UserName_Error(m.driver);
			m.CloseBrowser();
		}
	@Test(priority = 3)
	  public void Android_Blank_Username() throws MalformedURLException 
	    {
			Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
			m.MobileBrowser("Android","5.0","Asus");
			Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
			f.Mobile_WaitForElement(m.driver,"usernameIn","","");
			f.Mobile_Login("", "");
			f.Mobile_UserName_Error(m.driver);
			m.CloseBrowser();
		}
	@Test(priority = 4)
	  public void Android() throws MalformedURLException 
	    {
			Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
			m.MobileBrowser("Android","5.0","Asus");
			Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
			f.Mobile_WaitForElement(m.driver,"usernameIn","","");
			f.Mobile_Login("asdsdsadasda", "askdjahsdjhasjkdhaskjdh");
			f.Mobile_UserName_Error(m.driver);
			m.CloseBrowser();
		}



}

