package PageObject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GameArea_Page {

   
	 
	@FindBy(css = ".insideAnc.css-tooltip-right.color-orange") WebElement TopUp;
	 public void Top_Up()
	 {
		 TopUp.click();
	 }
	 
	 @FindBy(css=".dtPref.dtUlInside") WebElement Prefer;
	 public void Preference()
	 {
		 Prefer.click();
	 }
	 
	 @FindBy(css = ".sitOutNextInput.nexthand.checkcont.default_Checkbox") WebElement SitOut;
	 public void Enable_SitOut(WebDriver driver){
		 SitOut.click();
		 String pop_up = driver.findElement(By.className("infoPopup_Text")).getText();
		 if (pop_up.equalsIgnoreCase("Your sitout mode has been enabled for 10 mins.")){
			 
			 WebElement r1 = driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
			 r1.click();
		 }
	 }
	 
	 @FindBy(css = ".infoPopupBtn.iMBack.infoPopup_Yes.infoPopupConf") WebElement ImBack;
	 public void Disable_SitOut(WebDriver driver)
	 {
		ImBack.click();
		String pop_up = driver.findElement(By.className("infoPopup_Text")).getText();
		if (pop_up.equalsIgnoreCase("You have been removed from sitout mode."))
		{
          WebElement r1 = driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
		  r1.click();
		}
	  }
	 
	 @FindBy(css = ".dtCheckStyle.handStrengthInput.preferences_unchecked") WebElement Preference_HandStrength;
	 @FindBy(css = ".dtCheckStyle.muteGameSoundCheck.preferences_unchecked") WebElement Mute_Game_Sound;
	 @FindBy(css = ".dtCheckStyle.multirunCheck.preferences_unchecked") WebElement Multi_Run;
	 @FindBy(css = ".dtRightArr.avatarPopDiv") WebElement Select_Avatar;
	 public void Enable_HandStrength(WebDriver driver)
	 {
	   Prefer.click();
	   WebDriverWait wait1 = new WebDriverWait(driver,10);
	   // wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtCheckStyle.handStrengthInput.preferences_unchecked")));
	   /*while (wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtCheckStyle.handStrengthInput.preferences_unchecked"))) != null)
	    {
		   WebDriverWait wait = new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.visibilityOf(Preference_HandStrength));
		   Preference_HandStrength.click();
		 }
	   */
	   if (wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtCheckStyle.handStrengthInput.preferences_unchecked"))) != null)
	   {
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOf(Preference_HandStrength));
	    Preference_HandStrength.click();
	   
	   }
	 }
	 public void Disable_HandStrength(WebDriver driver)
	 {
		Prefer.click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		if (wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtCheckStyle.handStrengthInput"))) != null)
		 {
		    WebElement r = driver.findElement(By.cssSelector(".dtCheckStyle.handStrengthInput"));
		    WebDriverWait wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOf(r));
		    r.click();
		  }
	   } 
	 public void Enable_MuteGame(WebDriver driver)
	 {
	   /*Prefer.click();
	   WebDriverWait wait = new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.visibilityOf(Mute_Game_Sound));
	   Mute_Game_Sound.click();
	   */
	   Prefer.click();
	   WebDriverWait wait1 = new WebDriverWait(driver,10);
	   
	   if (wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtCheckStyle.muteGameSoundCheck"))) != null)
	   {
	    WebDriverWait wait2 = new WebDriverWait(driver,10);
	    wait2.until(ExpectedConditions.visibilityOf(Mute_Game_Sound));
	    Mute_Game_Sound.click();
	   }
	 
	 }
     public void Disable_MuteGame(WebDriver driver)
	 {
		 Prefer.click();
		 WebElement a = driver.findElement(By.cssSelector(".dtCheckStyle.muteGameSoundCheck"));
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.visibilityOf(a));
		 a.click();
	 } 
	 public void Enable_MultiRun(WebDriver driver)
	 {
	   Prefer.click();
	   WebDriverWait wait = new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.visibilityOf(Multi_Run));
	   Multi_Run.click();
	 }
	 public void Disable_MultiRun(WebDriver driver)
	 {
	   Prefer.click();
	   WebElement a = driver.findElement(By.cssSelector(".dtCheckStyle.multirunCheck"));
	   WebDriverWait wait = new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.visibilityOf(a));
	   a.click();
	   
	 }

	 public void Choose_Avatar(WebDriver driver,int avatar_number_1to30){
	     
		 
		 WebDriverWait w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dtPref.dtUlInside")));
		  Prefer.click();
		  Select_Avatar.click();
		  List<WebElement> l = driver.findElements(By.className("avatarsDivInside"));
			  if (avatar_number_1to30 < 31)
			  {
				 JavascriptExecutor js = (JavascriptExecutor)driver;
	             js.executeScript("window.scrollBy(0,"+avatar_number_1to30+")", "");
	             WebElement t = driver.findElement(By.cssSelector(".avatar"+avatar_number_1to30));
				 t.click();
		      }	  
		 
	 }
	 @FindBy(css = ".dtRightArr.seatPreferLi") WebElement Select_Seat;
	
	 public void ChooseSeat_Preference(WebDriver driver,int seatnumber,String TableName) throws ClassNotFoundException, SQLException
	 {
		Prefer.click();
		Select_Seat.click();
		db_connection c = new db_connection();
    	int MaxUser = c.MaxNumberUser_Table(TableName);
    	WebElement e1 = driver.findElement(By.cssSelector(".seatPreferThis.player_"+MaxUser+"_"+seatnumber+".common_seat"));
    	e1.click();
	 }
	 
	 
	 @FindBy(css= ".next_Room") WebElement JoinSimilar;
	 public void JoinSimilarTable(){
		 JoinSimilar.click();
	 }
	
	 @FindBy(css= ".leave_button a") WebElement Leaveseat;
	  public void LeaveSeat(){
		  Leaveseat.click();
	  }
	 
	  @FindBy(css = ".exit_button a") WebElement  Exitroom;
	  public void ExitRoom_WithOut_TakingSeatOnTable(){
		  Exitroom.click();
	  }
	  public void ExitRoom_After_TakingSeatOnTable(WebDriver driver){
		  Exitroom.click();
		  WebDriverWait wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".infoPopupBtn.infoPopup_Yes.infoPopupConf.infoBtn_realRmExt.pokerTable_Exit")));
		  WebElement e3  = driver.findElement(By.cssSelector(".infoPopupBtn.infoPopup_Yes.infoPopupConf.infoBtn_realRmExt.pokerTable_Exit"));
		  e3.click();
		 
	  }
	 
	  
	  @FindBy(className = "dtBanking") WebElement Banking;
	  public void ClickBanking(){
		 Banking.click();
		}
	  
	  @FindBy(css =".text_box.maxValue") WebElement BuyInForm_MaxValue_TextBox;
	  @FindBy(css =".maxamt .checkbx") WebElement BuyInForm_MaxValue_CheckBox;
	  @FindBy(css =".text_box.onlyNumeric.carryAmount") WebElement BuyInForm_OtherValue_TextBox;
	  @FindBy(css =".otheramt .checkbx") WebElement BuyInForm_OtherValue_CheckBox;
	  @FindBy(css = ".default_Checkbox .checkbx") WebElement Auto_Re_Buy;
	  @FindBy(css = ".buyInFormOk") WebElement OK_Button;
	  @FindBy(css = ".buyInFormCancel") WebElement Cancel_Button;
	  
	  public void BuyInForm(Boolean Other_CheckBox,String OtherAmount_Text,Boolean AutoReBuy, Boolean Cancel)
	  { 
		      
		  
		if (Other_CheckBox && AutoReBuy && !Cancel)
		  {
			BuyInForm_OtherValue_CheckBox.click();
			Auto_Re_Buy.click();
			BuyInForm_OtherValue_TextBox.clear();
			BuyInForm_OtherValue_TextBox.sendKeys(OtherAmount_Text);
			OK_Button.click();
			
		  }
		  else if (!(Other_CheckBox) && AutoReBuy && !Cancel)
		  { 
			BuyInForm_MaxValue_CheckBox.click();
			Auto_Re_Buy.click();
			BuyInForm_OtherValue_TextBox.clear();
			BuyInForm_OtherValue_TextBox.sendKeys(OtherAmount_Text);
			OK_Button.click();
		  }
		  else if (Other_CheckBox && !AutoReBuy && !Cancel)
		  {
			BuyInForm_MaxValue_CheckBox.click();
			BuyInForm_OtherValue_TextBox.clear();
			BuyInForm_OtherValue_TextBox.sendKeys(OtherAmount_Text);
		    OK_Button.click();
		   }
		  else if (!Other_CheckBox && !AutoReBuy && !Cancel)
		  {
		    OK_Button.click();
		  }  
		  else if (Cancel)
		  {
			 Cancel_Button.click();  
		  }
	    }
     
	  
      public void Assertion_And_ExitRoom(WebDriver driver,String Yes_No)
      {
    	Exitroom.click(); 
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("infoPopup_Text")));
    	String error = driver.findElement(By.className("infoPopup_Text")).getText();
    	
    	if (error.equalsIgnoreCase("Are you sure you want to exit currently joined room?") && (Yes_No.equalsIgnoreCase("Yes")))
    	{
    		WebElement a = driver.findElement(By.cssSelector(".infoPopupBtn.infoPopup_Yes.infoPopupConf.infoBtn_realRmExt.pokerTable_Exit"));
    	    a.click();    
    	}
    	else if (error.equalsIgnoreCase("Are you sure you want to exit currently joined room?") && (Yes_No.equalsIgnoreCase("No")))
    	{
     		WebElement a = driver.findElement(By.cssSelector(".infoPopupBtn.infoPopup_No.infoPopupConf.infoBtn_realRmExt.pokerTable_Exit"));
    	    a.click();    
    	}
    	  
      }
	  public void Avatar_Assertion()
	  {
	  //=======IMPLEMENT USING SIKULI 	  
	  }
	  
	  
	  @FindBy(xpath = "//*[@data-divtoshow='reportIssue']") WebElement Report_Issue;
	  @FindBy(xpath = "//*[@data-divtoshow='handHistory']") WebElement Hand_History;
	  @FindBy(xpath = "//*[@data-divtoshow='handRank']") WebElement Hand_Rank;
	  @FindBy(xpath = "//*[@data-divtoshow='notes']") WebElement Notes;
	  @FindBy(xpath = "//*[@data-divtoshow='dealerChatPart']") WebElement DealerChat;
	  @FindBy(xpath = "//*[@data-divtoshow='chat']") WebElement Chat;
	  @FindBy(xpath = "//*[@data-divtoshow='stats']") WebElement stats;
	  
    public void click_DealerChat(WebDriver driver) throws IOException
	  {
		DealerChat.click();
		
		//=========Assertion by taking Screenshot of dealer chat only till the point server integration not introduced
		
	/*	File s1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		
	
	
		int width = DealerChat.getSize().getWidth();
		int height = DealerChat.getSize().getHeight();
	
		Point p = DealerChat.getLocation();
		int x = p.getX();
		int y = p.getY();
		
	    BufferedImage i = ImageIO.read(s1);
	    
	    BufferedImage dealchat_screen = i.getSubimage(p.getX(),p.getY(),width,height);
		ImageIO.write(dealchat_screen, "png",s1);
		
		File dealer = new File("D:\\tmp\\testscreen.png");
		FileUtils.copyFile(s1, dealer);
		*/
	}
	public void click_Report_issue(WebDriver driver,String ReportIssue,String SendIssue_Yes__No_)
	{
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-divtoshow='reportIssue']")));
		
		Report_Issue.click();
		
		WebElement e1 = driver.findElement(By.cssSelector(".reportText "));
		e1.sendKeys(ReportIssue);
		WebElement e2 =driver.findElement(By.cssSelector(".reportBtn.report_btn"));
		e2.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".infoPopup_Text")));
		
		if (SendIssue_Yes__No_.equalsIgnoreCase("Yes"))
		 {
		  WebElement e3 = driver.findElement(By.id("yes"));
		  e3.click();
		  
		  WebDriverWait wait2 = new WebDriverWait(driver, 20);
		  wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".infoPopup_Text")));
			
		   String success_msg =driver.findElement(By.cssSelector(".infoPopup_Text")).getText();
			
			if (success_msg.equalsIgnoreCase("Issue has been successfully reported."))
			{
	         WebElement e5 = driver.findElement(By.cssSelector(".infoPopupBtn.closeInfoBtn"));
		     e5.click(); 
			}  
		 }
		else if (SendIssue_Yes__No_.equalsIgnoreCase("no"))
		 {	
		  WebElement e4 = driver.findElement(By.id("no"));
		  e4.click();
		 }
		
		
	}
    public void click_Stats(WebDriver driver)
    {
    	stats.click();
    }	  

    @FindBy(css = ".footer_Left_Navbutton.fold_Button.userAction") WebElement RunningGame_Fold;
	@FindBy(css = ".footer_Left_Navbutton.call_Button.userAction") WebElement RunningGame_Call;
	@FindBy(css= ".footer_Left_Navbutton.raise_Button.userAction") WebElement RunningGame_Raise;
    
	LogIn_Page wait;
    public void GamePlay_Fold(WebDriver driver){
    	wait.WaitForElement(driver,"","","",".footer_Left_Navbutton.fold_Button.userAction");
		RunningGame_Fold.click();
	}
    public void GamePlay_Call(WebDriver driver){
    	wait.WaitForElement(driver,"","","",".footer_Left_Navbutton.call_Button.userAction");
    	RunningGame_Call.click();
	}
	public void GamePlay_Raise(WebDriver driver){
		wait.WaitForElement(driver,"","","",".footer_Left_Navbutton.raise_Button.userAction");
    	RunningGame_Raise.click();
	}
	
    @FindBy(id = "checkFold") WebElement Check_Fold;
    @FindBy(id = "check") WebElement Call;
    @FindBy(id = "callAny") WebElement CallAny;
   
    public void Check_Fold(WebDriver driver){
    	wait.WaitForElement(driver,"checkFold","","","");
    	Check_Fold.click();
   } 
    public void Call(WebDriver driver){
    	wait.WaitForElement(driver,"check","","","");
    	Call.click();
   }
    public void CallAny(WebDriver driver){
    	wait.WaitForElement(driver,"callAny","","","");
    	CallAny.click();
   }
    
    @FindBy(id = "potRaiseFullPot") WebElement Raise_Pot;
    @FindBy(id = "potRaiseThreeFourth") WebElement Raise_Three_Fourth;
    @FindBy(id = "potRaiseOneHalf") WebElement Raise_Half;
    
    public void RaiseHalf(WebDriver driver)
    
    {
    	wait.WaitForElement(driver,"potRaiseOneHalf","","","");
        Raise_Half.click();	
    }
    public void Raise_ThreeFourth(WebDriver driver)
    {
    	wait.WaitForElement(driver,"potRaiseThreeFourth","","","");
        Raise_Three_Fourth.click();	
    }
    public void Raise_Pot(WebDriver driver)
    {
    	wait.WaitForElement(driver,"potRaiseFullPot","","","");
        Raise_Pot.click();	
    }
    
   
}



