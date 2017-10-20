/**
 * 
 */
package TestCases;

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
public class Login_ValidCredentials {

	public static void main(String[] args) throws InterruptedException {
		   
		BrowserPage browser = new BrowserPage();
 		browser.BrowserName("chrome");
        
 		WebDriverWait wait = new WebDriverWait(browser.driver, 30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameIn")));
 		
 		LogIn_Page L = PageFactory.initElements(browser.driver,LogIn_Page.class);
        L.Login("abc","a");
        
        WebDriverWait wait1 = new WebDriverWait(browser.driver, 30);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("logout_Button")));

        L.LogOut();
        
        browser.CloseBrowser();
        
        //  Log.LogOut();
	    
	}

}
