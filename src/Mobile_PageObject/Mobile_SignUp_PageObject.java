/**
 * 
 */
package Mobile_PageObject;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObject.LogIn_Page;

/**
 * @author Dhruv
 * Mar 10, 2016
 */
public class Mobile_SignUp_PageObject {

	/**
	 * @param args
	 */
 
      Mobile_Browser_PageObject m = new Mobile_Browser_PageObject();
	
	    public void Mobile_SignUp_Form(String UserName, String Password, String Email, String Gender) throws MalformedURLException{
			
	 	Mobile_LogIn_PageObject page = PageFactory.initElements(m.driver,Mobile_LogIn_PageObject.class);
        page.Mobile_WaitForElement(m.driver, "usernameIn","","");
        
        WebDriverWait wait = new WebDriverWait(m.driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'Register_Button cancelBtnHover ']")));
        
        page.Mobile_ClickSignUp(); 	
        page.Mobile_SignUp(UserName,Password,Email);
        
        if (Gender.equalsIgnoreCase("male")){
		Select gender = new Select(m.driver.findElement(By.id("gender")));
		gender.selectByIndex(1);
        }
        else if (Gender.equalsIgnoreCase("female")){
        	Select gender = new Select(m.driver.findElement(By.id("gender")));
    		gender.selectByIndex(2);
        }
        else if (Gender.equalsIgnoreCase("gender")){
        	Select gender = new Select(m.driver.findElement(By.id("gender")));
        	gender.selectByIndex(0);	
        }
	
        page.Mobile_ClickSignUpForm_SignUpButton();
        
     }
        public void Mobile_SignUpPage_UserName_ErrorMessage(){
	         
		    String error1 = m.driver.findElement(By.id("reg_uname")).getText();	
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
		public void Mobile_SignUpPage_Password_ErrorMessage(){
			String error2 = m.driver.findElement(By.id("reg_pwd")).getText();
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
		public void Mobile_SignUpPage_Email_ErrorMessage(){
			String error3 = m.driver.findElement(By.id("reg_email")).getText();
			
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
		public void Mobile_SignUpPage_GenderErrorMessage(){
			String error4 = m.driver.findElement(By.id("reg_gender")).getText();
			if (error4.equalsIgnoreCase("Gender is required.")){
				Assert.assertEquals(error4, "Gender is required.");
			}
			else if (error4.equalsIgnoreCase(null)){
				Assert.assertEquals("a","a");
			}
		}


	}


