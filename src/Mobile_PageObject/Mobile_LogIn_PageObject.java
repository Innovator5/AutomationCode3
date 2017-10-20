/**
 * 
 */
package Mobile_PageObject;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Dhruv
 * Mar 10, 2016
 */
public class Mobile_LogIn_PageObject {
	@FindBy(id ="usernameIn") public static WebElement UserName_Text;
	@FindBy(id= "password") static WebElement Password_Text;
	public void Mobile_Login(String Name, String Password)
	{
     UserName_Text.sendKeys(Name);	    
     Password_Text.sendKeys(Password);
     Password_Text.sendKeys(Keys.ENTER);
	}
	@FindBy(xpath ="//*[@class = 'Register_Button cancelBtnHover ']") static WebElement SignUp_Button;
	public void Mobile_ClickSignUp(){
		 SignUp_Button.click();
	}
	
	@FindBy(id ="registerCheck") WebElement EnableSignUpCheckBox;
	@FindBy(id = "registerUname") static WebElement RegisterName;
	@FindBy(id = "registerPassword") static WebElement Register_Password;
	@FindBy(id= "registerMail")	static WebElement Register_Email;
	@FindBy(id= "registerSignIn") static WebElement Form_SignUp_Button;
	public void Mobile_SignUp(String Name, String Password, String Email)
	{
		 RegisterName.sendKeys(Name);
		 Register_Password.sendKeys(Password);
	     Register_Email.sendKeys(Email);
	     EnableSignUpCheckBox.click();
	     Form_SignUp_Button.click();	
	}
	
	@FindBy(id= "registerSignIn") static WebElement SignUpForm_SignUpButton;
	public void Mobile_ClickSignUpForm_SignUpButton(){
		SignUpForm_SignUpButton.click();
	}
	
	@FindBy(className= "forgot_Password ") static WebElement ForgotPassword_Button;
	public void Mobile_ForgotPassword(String Email)
	{
	     ForgotPassword_Button.click();
		
	}
	
	@FindBy(id= "logout_Button" ) WebElement LogOut_Button;
	public void Mobile_LogOut(){
		LogOut_Button.click();
	}
	public void Mobile_WaitForElement(WebDriver driver, String id, String classname, String xpath){
	   
    	  if (classname.equals("") && xpath.equals(""))
		  {      	
    		By c = By.id(id);
	    	WebDriverWait wait = new WebDriverWait(driver, 50);
	    	wait.until(ExpectedConditions.elementToBeClickable(c));
		  } 
    	  else if(id.equals("")&& xpath.equals(""))
			 {
	        		By c = By.className(classname);
		    		WebDriverWait wait = new WebDriverWait(driver, 30);
		    	    wait.until(ExpectedConditions.elementToBeClickable(c));
			    
			 }
    	  else if(id.equals("")&& classname.equals("")) 	 
    	  {
			By c = By.xpath(xpath);
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    	    wait.until(ExpectedConditions.elementToBeClickable(c));
          }
    	  else {
    		  
    		 System.out.println("Please Enter A Valid Locator");
    	  }
    	  
	  }
	public void Mobile_UserName_Error(WebDriver d){
    	
    	String error = d.findElement(By.id("loginerror")).getText();
    
    	if (error.contains("Username or password is empty."))
    	{  
    		Assert.assertThat(error,CoreMatchers.containsString("Username Or Password Is Empty."));
        }
    	else if (error.contains("User Name Is Not Recognized")){
    		Assert.assertThat(error,CoreMatchers.containsString("User Name Is Not Recognized"));
    	 }
    	else if (error.contains("Wrong password for user abcd")){
    		Assert.assertThat(error,CoreMatchers.containsString("Wrong password for user abcd"));
        }
    	else if (error.contains("Wrong password for user")){
    		Assert.assertThat(error,CoreMatchers.containsString("Wrong password for user"));
        }
    	
    }
  }
