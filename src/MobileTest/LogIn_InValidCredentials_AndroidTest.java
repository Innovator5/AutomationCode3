package MobileTest;

import org.testng.annotations.Test;

import Mobile_PageObject.Mobile_Browser_PageObject;
import Mobile_PageObject.Mobile_LogIn_PageObject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

public class LogIn_InValidCredentials_AndroidTest {

  @Test
  public void Android_LogIn_InvalidCredentials() throws IOException 
  {
	  Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
		m.MobileBrowser("Android","5.0","Asus");
		Mobile_LogIn_PageObject f = PageFactory.initElements(m.driver, Mobile_LogIn_PageObject.class);
		f.Mobile_WaitForElement(m.driver,"usernameIn","","");
		f.Mobile_Login("asdsdsadasda", "askdjahsdjhasjkdhaskjdh");
		f.Mobile_UserName_Error(m.driver);
  }

}
