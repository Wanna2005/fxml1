package hmi.model;
import java.sql.*;

import application.DBConnection;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class LoginDao {
	public static boolean checkCredential (String username,String password) throws SQLException
	{

		Connection con=DBConnection.connect();
		if (con!=null)
		{
			System.out.println("Connection Successful");
			
			System.out.println(username);
			System.out.println(password);
			//sql string
			String sql="select * from users where username like ? and password like?";
			//sql statment
			PreparedStatement stmt =con.prepareStatement(sql);
			((PreparedStatement) stmt).setString(1,username);
			((PreparedStatement) stmt).setString(2,password);
			ResultSet rs=stmt.executeQuery();
		
			if (rs.next())
			{
			
				return true;
			}
			else
			{
				
				return false;
			}
			
			
		}
		return false;
		
	}

}
