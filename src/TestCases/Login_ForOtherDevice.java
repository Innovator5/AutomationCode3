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
public class Login_ForOtherDevice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		BrowserPage b= new BrowserPage();
		b.BrowserName("chrome");
		
		WebDriverWait wait = new WebDriverWait(b.driver, 30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameIn")));
		
		LogIn_Page page = PageFactory.initElements(b.driver, LogIn_Page.class);
		page.Login("abc","a");
		
		BrowserPage b1 = new BrowserPage();
		b1.BrowserName("chrome");
		
		WebDriverWait wait1 = new WebDriverWait(b1.driver, 30);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameIn")));
		
		LogIn_Page page1 = PageFactory.initElements(b1.driver, LogIn_Page.class);
		page1.Login("abc", "a");
		
		WebDriverWait wait2 = new WebDriverWait(b1.driver, 20);
  		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginerror")));
  		
		String message = b1.driver.findElement(By.id("loginerror")).getText();
  		System.out.println(message);
  		
  		Assert.assertEquals("User Abc Is Already Logged In From Some Other Device.", message);
		
	}

}
