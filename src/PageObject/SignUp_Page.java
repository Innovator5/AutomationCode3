/**
 * 
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



/**
 * @author Dhruv
 * Mar 3, 2016
 */
public class SignUp_Page {

	/**
	 * @param args
	 */

	BrowserPage browser = new BrowserPage();
	
	
	public void SignUp_Form(String browserName,String UserName, String Password, String Email, String Gender){
		
		browser.BrowserName(browserName);
		
		LogIn_Page page = PageFactory.initElements(browser.driver,LogIn_Page.class);

		page.WaitForElement(browser.driver, "usernameIn","","","");
        
        WebDriverWait wait = new WebDriverWait(browser.driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'Register_Button cancelBtnHover ']")));
   
        page.ClickSignUp(); 	
        
        page.SignUp(UserName,Password,Email);
        
        if (Gender.equalsIgnoreCase("male")){
		Select gender = new Select(browser.driver.findElement(By.id("gender")));
		gender.selectByIndex(1);
        }
        else if (Gender.equalsIgnoreCase("female")){
        	Select gender = new Select(browser.driver.findElement(By.id("gender")));
    		gender.selectByIndex(2);
        }
        else if (Gender.equalsIgnoreCase("gender")){
        	Select gender = new Select(browser.driver.findElement(By.id("gender")));
        	gender.selectByIndex(0);	
        }
	
        page.ClickSignUpForm_SignUpButton();
        
     }
	
	public void SignUpPage_UserName_ErrorMessage(){
	         
	    String error1 = browser.driver.findElement(By.id("reg_uname")).getText();	
        if (error1.equalsIgnoreCase("User Name must be minimum 3 and maximum 20 characters in length."))
        {
        	Assert.assertEquals(error1,"User Name must be minimum 3 and maximum 20 characters in length.");
        }
        else if (error1.equalsIgnoreCase("User Name already registered."))
        { 
        	Assert.assertEquals(error1,"User Name already registered.");
        }
        else if (error1.equalsIgnoreCase("User Name is required.")){
       
        	Assert.assertEquals(error1,"User Name is required.");
        }
        else if (error1.equalsIgnoreCase(null)){
        	Assert.assertEquals("a", "a");
        }
        
	}
	public void SignUpPage_Password_ErrorMessage(){
		String error2 = browser.driver.findElement(By.id("reg_pwd")).getText();
		if (error2.equalsIgnoreCase("Password is required.")){
			Assert.assertEquals(error2, "Password is required.");
		}
		else if (error2.equalsIgnoreCase("Password must be minimum 8 and maximum 20 characte…")){
			Assert.assertEquals(error2, "Password must be minimum 8 and maximum 20 characte…");
		}
		else if (error2.equalsIgnoreCase("")){
			Assert.assertEquals("a", "a");
		}
	}
	
	public void SignUpPage_Email_ErrorMessage(){
		String error3 = browser.driver.findElement(By.id("reg_email")).getText();
		
		if (error3.equalsIgnoreCase("Email is required.")){
			Assert.assertEquals(error3,"Email is required.");
		}
		else if (error3.equalsIgnoreCase("Please enter a valid email address.")){
			Assert.assertEquals(error3,"Please enter a valid email address.");
		}
		else if (error3.equalsIgnoreCase("Email id already registered.")){
			Assert.assertEquals(error3, "Email id already registered.");
		}
		else if (error3.equalsIgnoreCase("")){
			Assert.assertEquals("a", "a");
		}
	}
	public void SignUpPage_GenderErrorMessage(){
		String error4 = browser.driver.findElement(By.id("reg_gender")).getText();
		if (error4.equalsIgnoreCase("Gender is required.")){
			Assert.assertEquals(error4, "Gender is required.");
		}
		else if (error4.equalsIgnoreCase(null)){
			Assert.assertEquals("a","a");
		}
	}
	public void SignUp_Close(){
		browser.CloseBrowser();
	}
	 @FindBy(id = "registerCancel") WebElement SignUpButton;
	
	 public void SignUp_Cancel(){
	       SignUpButton.click();	
	}
}
