/**
 * 
 */
package Mobile_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Dhruv
 * Mar 11, 2016
 */
public class Mobile_Lobby_PageObject {

    
	@FindBy(id ="menuBtn") WebElement MenuButton;
	public void Mobile_ClickMenuButton(){
		MenuButton.click();
	}
	
	@FindBy (className = "lobbyDataType jscrumy_practice freeroll") WebElement FreeRoll;
	@FindBy (className = "lobbyDataType jsrummy_cash1 cash") WebElement REAL;
	@FindBy (className = "lobbyDataType sngTable") WebElement SNG;
	@FindBy (className = "lobbyDataType tourney") WebElement Tourney;
	@FindBy (className = "lobbyDataType cash_ring crumy_loby_firstchild activetable") WebElement Ring;
	@FindBy (className = "lobbyDataType cash_holdem_ring") WebElement HoldEm;
	@FindBy (className = "lobbyDataType cash_omaha") WebElement Omaha;
	@FindBy (className = "lobbyDataType cash_omaha_hl") WebElement OmahaHL;
	@FindBy (className = "lobbyDataType cash_sprint") WebElement Sprint;
	@FindBy (className = "lobbyDataType cash_crazy_pineapple") WebElement Crazy_Pineapple;
	@FindBy(className="lobbyDataType tournament_tab crumy_loby_firstchild activetable") WebElement Lobby;
	@FindBy(className = "lobbyDataType my_tickets_tournament_tab") WebElement MyTickets;
	
	

	public void Mobile_SelectGame(String GameName, String GameType){
		
		if (GameName.equalsIgnoreCase("FreeRoll")){
               FreeRoll.click();
			if (GameType.equalsIgnoreCase("Ring")){
				  Ring.click();
			}
			else if (GameType.equalsIgnoreCase("HoldEm")){
				HoldEm.click();
			}
			else if (GameType.equalsIgnoreCase("Omaha")){
				Omaha.click();
			}
			else if(GameType.equalsIgnoreCase("OmahaHL")){
				OmahaHL.click();
			}
			else if (GameType.equalsIgnoreCase("Sprint")){
				Sprint.click();
			}
			else if (GameType.equalsIgnoreCase("Crazy_Pineapple")){
				Crazy_Pineapple.click();
			}
		}
		else if (GameName.equalsIgnoreCase("Real")){
			REAL.click();
			if (GameType.equalsIgnoreCase("Ring")){
				  Ring.click();
			}
			else if (GameType.equalsIgnoreCase("HoldEm")){
				HoldEm.click();
			}
			else if (GameType.equalsIgnoreCase("Omaha")){
				Omaha.click();
			}
			else if(GameType.equalsIgnoreCase("OmahaHL")){
				OmahaHL.click();
			}
			else if (GameType.equalsIgnoreCase("Sprint")){
				Sprint.click();
			}
			else if (GameType.equalsIgnoreCase("Crazy_Pineapple")){
				Crazy_Pineapple.click();
			}
		}
		else if (GameName.equalsIgnoreCase("SNG")){
			
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
	
	public void Mobile_View_TableList(String View_Type){
		
		if (View_Type.equalsIgnoreCase("Default")){
			DefaultView.click();
		}
		else if(View_Type.equalsIgnoreCase("List")){
			ListView.click();
		}
	}
	
	
	
	


}
