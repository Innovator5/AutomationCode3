package PageObject;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lobby_Page {
	
	@FindBy (css = ".lobbyDataType.jscrumy_practice.freeroll") WebElement FreeRoll;
	@FindBy (css = ".lobbyDataType.jsrummy_cash1.cash") WebElement REAL;
	@FindBy (css = ".lobbyDataType.sngTable") WebElement SNG;
	@FindBy (css = ".lobbyDataType.tourney") WebElement Tourney;
	@FindBy (css = ".lobbyDataType.freeroll_ring.crumy_loby_firstchild") WebElement Ring;
	@FindBy (css = "[class='lobbyDataType freeroll_holdem_ring']") WebElement HoldEm;
	@FindBy (css = ".lobbyDataType.freeroll_omaha") WebElement Omaha;
	@FindBy (css = ".lobbyDataType.freeroll_omaha_hl") WebElement OmahaHL;
	@FindBy (css = ".lobbyDataType.freeroll_sprint") WebElement Sprint;
	@FindBy (css = ".lobbyDataType.freeroll_crazy_pineapple") WebElement Crazy_Pineapple;
	@FindBy (css=  ".lobbyDataType.tournament_tab crumy_loby_firstchild") WebElement Lobby;
	@FindBy (css = ".lobbyDataType.my_tickets_tournament_tab") WebElement MyTickets;
	
	//========================Different Locator for GameType under REAL GameName==================================
	@FindBy (css = "[class='lobbyDataType cash_ring crumy_loby_firstchild']") WebElement Real_Ring;
	@FindBy (css = "[class='lobbyDataType cash_holdem_ring']") WebElement Real_HoldEm;
	@FindBy (css = "[class='lobbyDataType cash_omaha']") WebElement Real_Omaha;
	@FindBy (css = "[class='lobbyDataType cash_omaha_hl']") WebElement Real_OmahaHL;
	@FindBy (css = "[class='lobbyDataType cash_sprint']") WebElement Real_Sprint;
	@FindBy (css = "[class='lobbyDataType cash_crazy_pineapple']") WebElement Real_Crazy_Pineapple;
	//=============================================================================================================
	
	
	public void SelectGame(WebDriver driver,String GameName,String GameType){
	 
		
		
		
		if (GameName.equalsIgnoreCase("FreeRoll"))
		  {
			FreeRoll.click();
			
			    if(GameType.equalsIgnoreCase("Ring")){ 
			    	Ring.click();
			    }
			    else if (GameType.equalsIgnoreCase("HoldEm")){
			    	HoldEm.click();
			    }
			    else if (GameType.equalsIgnoreCase("Omaha")){
					Omaha.click();
			    }
			    else if (GameType.equalsIgnoreCase("OmahaHL")){
			    	OmahaHL.click();
			    }
			    else if (GameType.equalsIgnoreCase("Sprint")){
			    	Sprint.click();
			    }
			    else if (GameType.equalsIgnoreCase("CrazyPineapple")){
			    	Crazy_Pineapple.click();
			    }
		  }
		else if (GameName.equalsIgnoreCase("Real"))
		{
        	REAL.click();
			    if(GameType.equalsIgnoreCase("Ring")){ 
			    	Real_Ring.click();
			    }
			    else if (GameType.equalsIgnoreCase("HoldEm")){
			    	Real_HoldEm.click();
			    }
			    else if (GameType.equalsIgnoreCase("Omaha")){
			    	Real_Omaha.click();
			    }
			    else if (GameType.equalsIgnoreCase("OmahaHL")){
			    	Real_OmahaHL.click();
			    }
			    else if (GameType.equalsIgnoreCase("Sprint")){
			    	Real_Sprint.click();
			    }
			    else if (GameType.equalsIgnoreCase("CrazyPineapple")){
			    	Real_Crazy_Pineapple.click();
			    }
		  }
		
		else if (GameName.equalsIgnoreCase("SNG") && GameType.equalsIgnoreCase("")){
			SNG.click();
		}
		else if (GameName.equalsIgnoreCase("Tourney"))
		{
			Tourney.click();
			if (GameType.equalsIgnoreCase("Lobby")){
				Lobby.click();
			}
			else if (GameType.equalsIgnoreCase("My Tickets")){
		             MyTickets.click();  		
			}
		}
	}

	
	@FindBy(id = "expViewBtn") WebElement ListView;
	@FindBy(id  = "defViewBtn") WebElement DefaultView;
	
	public void View_TableList(String View_Type){
		
		if (View_Type.equalsIgnoreCase("Default")){
			DefaultView.click();
		}
		else if(View_Type.equalsIgnoreCase("List")){
			ListView.click();
		}
	}
	
	
	@FindBy(className = "logout_Button") WebElement LogOut_Button;
	public void Logout(){
		LogOut_Button.click();
	}
	

	// Logic CLAIM CHIPS BUTTON for chips pop-up required in testcase.
	@FindBy(className ="mystery_chips") WebElement ClaimChips_Button;
	public void ClaimChips(){
		ClaimChips_Button.click();
	}
	
	@FindBy(className = "chipsConvrt") WebElement ConversionTab;
	@FindBy(xpath="//*[@class = 'chipCon']/li[1]") WebElement RealToVip;
	@FindBy(xpath= "//*[@class = 'chipCon']/li[2]") WebElement VipToReal;
	
	public void VipChipCoversion(String ChipType){
		  if (ChipType.equalsIgnoreCase("VIP"))
		  {
			  ConversionTab.click();
			  VipToReal.click();
		 }
		  else if (ChipType.equalsIgnoreCase("Real")){
			  ConversionTab.click();
			  RealToVip.click();
		  }
	}

   // Database Query for Verifying the User's Loyalty Point and Loyalty Level
     @FindBy(xpath = "//*[@class = 'navUl']/li[4]") WebElement Loyalty_Button;
     @FindBy(id ="loyaltyPt") WebElement LoyaltyPoint;
     @FindBy(id = "loyaltyL") WebElement LoyaltyLevel;
     public void Loyalty(){
    	 Loyalty_Button.click();
    	 String point = LoyaltyPoint.getText(); 
    	 String Level = LoyaltyLevel.getText();
     }
     
     @FindBy(id = "refreshAccount") WebElement AccountRefresh;
     
     public void AccRefresh (){
    	 
    	 AccountRefresh.click();
     }
     
     
   // Logic REDEEM open different window handle.
     @FindBy(css= ".navA.bankingTab") WebElement Redeem;
     public void ClickRedeemButton(){
    	 Redeem.click();
    }

     public void TableName(WebDriver driver,String tablename)
     {
    	 List<WebElement> list = driver.findElements(By.xpath("//*[@class= 'scrollContent']/tr/td[1]/a"));
         System.out.println(list.size());
         for (int i = 1;i<list.size()-1;i++)
         {   
             String e3 = driver.findElement(By.xpath("//*[@class= 'scrollContent']/tr["+i+"]/td[1]/a")).getText();
        	 System.out.println(e3); 
         	 if (e3.equalsIgnoreCase(tablename))
             {
               JavascriptExecutor js = (JavascriptExecutor)driver;
               js.executeScript("window.scrollBy(0,"+i+")", "");
               System.out.println(i);
               WebElement r = driver.findElement(By.xpath("//*[@class= 'scrollContent']/tr["+i+"]/td[8]/a"));
               r.click(); 
             }    
        }
     }
     
     
     public void RoomName(WebDriver driver, String DBName,String RoomName) throws ClassNotFoundException, SQLException
     {
 		db_connection c = new db_connection();
 		int f = c.TableID(RoomName);
 		c.CloseConnection();
 		WebElement g = driver.findElement(By.xpath("//*[@data-rowid='"+f+"']/td[7]/a"));
        g.click();
     }
     
     public void TakeSeat(WebDriver driver,String RoomName, int seatnumber) throws ClassNotFoundException, Exception{
    	   
    	 // GET the value from DB
    	 db_connection c = new db_connection();
    	 int totalseat = c.MaxNumberUser_Table(RoomName);
         System.out.println(totalseat);  	 
   	    
         if (totalseat == 2)
    	  {
   		    if (seatnumber == 1)
   		      {
   			   WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser2_1 cRight seat_1'][@id = 'seat_1']"));
   			   t1.click();
   		      }
   		    else 
   		      {
   		    	WebElement t2 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser2_2 cLeft seat_2'][@id = 'seat_2']"));
   		    	t2.click();
   		       }
   		  }
         else if(totalseat ==4)
         {
        	 if(seatnumber == 1 || seatnumber ==2)
        	 {
        		WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser4_"+seatnumber+" cRight seat_"+seatnumber+"'][@id = 'seat_"+seatnumber+"']")); 
                t1.click();
        	 } 
        	 else if (seatnumber == 3 || seatnumber ==4)
        	 {
        		WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser4_"+seatnumber+" cLeft seat_"+seatnumber+"'][@id = 'seat_"+seatnumber+"']")); 
                t1.click();
             }
        	 
         }
         else if (totalseat == 6){
        	 if (seatnumber ==1 || seatnumber == 2 || seatnumber == 3)
        	 {      
        		    WebDriverWait d = new WebDriverWait(driver,20);
        		    d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser6_1 cRight seat_1'][@id = 'seat_1']")));
        		    WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_Maxuser6_"+seatnumber+" cRight seat_"+seatnumber+"'][@id = 'seat_"+seatnumber+"']")); 
                    t1.click();
             }
        	 else if (seatnumber == 4 || seatnumber == 5 || seatnumber == 6)
        	 {
        		 WebDriverWait d = new WebDriverWait(driver,20);
     		     WebElement t1 = driver.findElement(By.id("seat_"+seatnumber)); 
     		     
     		     Actions actions = new Actions(driver);
     		     actions.moveToElement(t1).click();
                
     		     Action action = actions.build();
     		     action.perform();
     		   
     		    // t1.click();
   		      
      		   
     		     /*WebElement t2 = driver.findElement(By.xpath("//*[@id='seat_5']/div[1]/a"));
     		     d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='seat_5']/div[1]/a")));
     		     */
             
     		   
     		     /*Actions j = new Actions(driver);
                 j.click(t1);
                 Action b = j.build();
                 b.perform();*/
                 
     		 }
         }
         else if (totalseat == 9){
        	 if (seatnumber == 1 ||seatnumber ==2 || seatnumber == 3 || seatnumber == 4)
        	 {
        		 WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_"+seatnumber+" cRight seat_"+seatnumber+"'][@id = 'seat_"+seatnumber+"']")); 
                 t1.click();	 
        	 }
        	 else if (seatnumber == 5 ||seatnumber == 6 || seatnumber == 7 || seatnumber == 8 || seatnumber == 9) 
        	 {
        		 WebElement t1 = driver.findElement(By.xpath("//*[@class= 'player_Seat player_Div_"+seatnumber+" cLeft seat_"+seatnumber+"'][@id = 'seat_"+seatnumber+"']")); 
                 t1.click();	 
        	 }
         }
         else 
         {
        	 System.out.println("Please check the table TOTAL SEAT in a Table versus seatnumber");
         }
    }
    
 //==========++++ Table Header Locations for Sorting of data ++++=====================
     
     
     
     
     
     public void SortingOn_BasedOn_Name(WebDriver driver)
     {
    	 List<WebElement> HeaderData = driver.findElements(By.className("tablesorter-header-inner"));
    	 for (int i= 0; i<HeaderData.size()-1 ;i++)
    	 {
    		 String a = driver.findElement(By.className("tablesorter-header-inner")).getText();
             System.out.println(a); 
    	 }
    	 
     }
  }
