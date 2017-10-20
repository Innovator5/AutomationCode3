/**
 * 
 */
package TestCases;

import PageObject.LogIn_Page;
import PageObject.SignUp_Page;

/**
 * @author Dhruv
 * Mar 3, 2016
 */
public class SignUp_ValidCredentials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            
		SignUp_Page page = new SignUp_Page();
		page.SignUp_Form("firefox","adda52","as","dhruvtyagi4034@gmail.com","female");
		page.SignUpPage_Password_ErrorMessage();	 
	    page.SignUpPage_Email_ErrorMessage(); 
	
	}

}
