package PageObject;

import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LogIn_Page {
	
	@FindBy(how = How.ID, using = "usernameIn") public static WebElement UserName_Text;
	@FindBy(id= "password") static WebElement Password_Text;
	@FindBy(id= "loginBt") static WebElement Login_Button;
	@FindBy(xpath ="//*[@class = 'Register_Button cancelBtnHover ']") static WebElement SignUp_Button;
	@FindBy(className= "forgot_Password ") static WebElement ForgotPassword_Button;
	@FindBy(id = "registerUname") static WebElement RegisterName;
	@FindBy(id = "registerPassword") static WebElement Register_Password;
	@FindBy(id= "registerMail")	static WebElement Register_Email;
	@FindBy(id= "registerSignIn") static WebElement Form_SignUp_Button;
	
	public void Login(String Name, String Password)
	{
     UserName_Text.sendKeys(Name);	    
     Password_Text.sendKeys(Password);
     Login_Button.click();
	}
	
	public void ClickSignUp(){
		 SignUp_Button.click();
			
	}
	@FindBy(id ="registerCheck") WebElement EnableSignUpCheckBox;
	public void SignUp(String Name, String Password, String Email)
	{
		 RegisterName.sendKeys(Name);
		 Register_Password.sendKeys(Password);
	     Register_Email.sendKeys(Email);
	     EnableSignUpCheckBox.click();
	     Form_SignUp_Button.click();	
	}
	@FindBy(id= "registerSignIn") static WebElement SignUpForm_SignUpButton;
	public void ClickSignUpForm_SignUpButton(){
		SignUpForm_SignUpButton.click();
	}
	public void ForgotPassword(String Email)
	{
	     ForgotPassword_Button.click();
	//	 driver.findElement(By.id(""));
		
	}
	@FindBy(css= ".logout-text" ) WebElement LogOut_Button;
	public void LogOut(){
		LogOut_Button.click();
	}
	
    public void WaitForElement(WebDriver driver, String id, String classname, String xpath,String css){
	   
    	  if (classname.equals("") && xpath.equals("") && css.equals(""))
		  {      	
    		  
    		By c = By.id(id);
	    	WebDriverWait wait = new WebDriverWait(driver, 30);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(c));
		  } 
    	  else if(id.equals("")&& xpath.equals("") && css.equals(""))
		   {
	        		By c = By.className(classname);
		    		WebDriverWait wait = new WebDriverWait(driver, 30);
		    		 wait.until(ExpectedConditions.visibilityOfElementLocated(c));
		    }
    	  else if(id.equals("")&& classname.equals("") && css.equals("")) 	 
    	   {
			By c = By.xpath(xpath);
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    	    wait.until(ExpectedConditions.visibilityOfElementLocated(c));
           }
    	  else if (id.equals("") && classname.equals("") && xpath.equals(""))
    	   {
    	    By c = By.cssSelector(css);
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    	    wait.until(ExpectedConditions.visibilityOfElementLocated(c));
            }
    	  else {
    		  
    		 System.out.println("Please Enter A Valid Locator");
    	  }
	     
    	  
    }
  /*  public void Login_ErrorMessage(){
    	String message =""; 
    	Assert.assertEquals("User Name Ab Is Not Recognized", message);
    }
  */
    public void UserName_Error(WebDriver driver,String UserName){
    	
    	/*CharSequence err = "User Name Is Not Recognized";
        CharSequence err1 = "Wrong password for user abcd";
    	CharSequence e3 = "Wrong password for user";
        */
    	String error = driver.findElement(By.id("loginerror")).getText();
    
    	if (error.contains("Username or password is empty."))
    	{  
    	//	Assert.assertEquals(error,"Username Or Password Is Empty.");
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
   
    
