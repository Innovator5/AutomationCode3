/**
 * 
 */
package TestCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.db_connection;

/**
 * @author Dhruv
 * Mar 21, 2016
 */
public class testng{

	/**
	 * @param args
	 * @return 
	 * @return 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
  
    static Connection con;
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		
		   String dburl = "jdbc:mysql://192.168.2.202:3306/cardplay_poker";
		   String username ="gauss";
		   String password = "";
		   String Query = "Select id from cp_game_config where remarks ='Chennai Chase'"; 
		   int result = 0;

		   Class.forName("com.mysql.jdbc.Driver");
		   con = DriverManager.getConnection(dburl, username, password);
		  
		   Statement stm = con.createStatement();
		   ResultSet r = stm.executeQuery(Query);
		   
		  while (r.next())
		    {
		       result = r.getInt(1);
		    }
		    System.out.println(result);
     	}

    
	public static int DBQuery(String DBName, String Query) throws ClassNotFoundException, SQLException{
		   int result = 0;
   
		   if (DBName.equalsIgnoreCase("cardplay_poker")){
/*			   String dburl = "jdbc:mysql://192.168.2.202:3306/cardplay_poker";
			   String username ="gauss";
			   String password = "";
*/			   
			    // "Select id from cp_game_config where remarks ='Chennai Chase'"; 
               Class.forName("com.mysql.jdbc.Driver");
			   con = DriverManager.getConnection("jdbc:mysql://192.168.2.202:3306/cardplay_poker","gauss","");
			    
			   Statement stm = con.createStatement();
			   ResultSet r = stm.executeQuery(Query);
			   
			  while (r.next())
			    {
			       result = r.getInt(1);
			    }
			}
		   else if (DBName.equalsIgnoreCase("cardplay")){
/*			   String dburl = "jdbc:mysql://192.168.2.202:3306/cardplay_poker";
			   String username ="gauss";
			   String password = "";
*/			   
			    // "Select id from cp_game_config where remarks ='Chennai Chase'"; 
               Class.forName("com.mysql.jdbc.Driver");
			   con = DriverManager.getConnection("jdbc:mysql://192.168.2.202:3306/cardplay","gauss","");
			   Statement stm = con.createStatement();
			   ResultSet r = stm.executeQuery(Query);
			  while (r.next())
			    {
			       result = r.getInt(1);
			    }
			}
		   return result;
		}
	
	public static void CloseConnection() throws SQLException{
		 con.close();
	 }
  } 
