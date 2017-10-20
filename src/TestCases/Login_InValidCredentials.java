/**
 * 
 */
package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.BrowserPage;
import PageObject.LogIn_Page;

/**
 * @author Dhruv
 * Mar 2, 2016
 */
public class Login_InValidCredentials {
	
     public static void main(String[] args){
    	      
    	      BrowserPage browser = new BrowserPage();
    		  browser.BrowserName("firefox");
    		  LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);
    		  
    		  page.WaitForElement(browser.driver,"usernameIn","","","");
    		  page.Login("ab","a");
    		  page.UserName_Error(browser.driver,"ab");
    		  
    	    
     }
}
