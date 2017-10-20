/**
 * 
 */
package TestCases;

import org.openqa.selenium.support.PageFactory;

import PageObject.BrowserPage;
import PageObject.LogIn_Page;
import PageObject.SignUp_Page;

/**
 * @author Dhruv
 * Mar 3, 2016
 */
public class SignUp_Invalid_UserName {

	/**
	 * @param  -- Name Less than 3 character
	 *         -- Name Cannot be more than 20 character
	 *         -- User name already taken
	 */
	public static void main(String[] args) {
               
		   SignUp_Page page  = new SignUp_Page();
		   page.SignUp_Form("chrome","Ad", "ADDA@123131", "xyz@a.com","male" );
           
		   page.SignUpPage_UserName_ErrorMessage();
		   page.SignUpPage_Password_ErrorMessage();
		   
	}

}
