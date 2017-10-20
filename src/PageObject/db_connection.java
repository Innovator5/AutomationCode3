package PageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db_connection
{
 static Connection con;
	  
	public  int TableID(String TableName) throws ClassNotFoundException, SQLException
	{
	          int result = 0;
		   // "Select id from cp_game_config where remarks ='Chennai Chase'"; 
		       Class.forName("com.mysql.jdbc.Driver");
			   con = DriverManager.getConnection("jdbc:mysql://192.168.2.202:3306/cardplay_poker","gauss","");
			   Statement stm = con.createStatement();
			   String query = "Select id from cp_game_config where remarks ='"+TableName+"'";
			   ResultSet r = stm.executeQuery(query);
			    while (r.next())
				{
				   result = r.getInt(1);
				 }
			    return result;
	     }    
		
	public int MaxNumberUser_Table(String TableName) throws ClassNotFoundException, SQLException
    {    int res = 0;
        // "Select id from cp_game_config where remarks ='Chennai Chase'"; 
	       Class.forName("com.mysql.jdbc.Driver");
		   con = DriverManager.getConnection("jdbc:mysql://192.168.2.202:3306/cardplay_poker","gauss","");
		   Statement stm = con.createStatement();
		   String query = "Select max_players from cp_game_config where remarks ='"+TableName+"'";
		   ResultSet r = stm.executeQuery(query);
		    while (r.next())
			{
			   res = r.getInt(1);
			 }
		    return res;
		 }
	

	public  void CloseConnection() throws SQLException
	         {
				 con.close();
			 }
     }