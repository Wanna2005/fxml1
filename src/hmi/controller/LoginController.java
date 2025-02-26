package hmi.controller;



import java.sql.Connection;
import java.sql.SQLException;

import application.DBConnection;
import hmi.model.LoginDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class LoginController {
	@FXML 
	private TextField txtUsername;
	@FXML  
	private TextField txtPassword;
	@FXML 
	private Button btnLogin;
	@FXML 
	
	private void loginClick() throws SQLException
	{
		String username= null;
		String password=null;
		username=txtUsername.getText();
		password=txtPassword.getText();
		
		boolean status = LoginDao.checkCredential(username, password);
		if(!status)
		{
			Alert alert=new Alert (AlertType.ERROR,"Wrong Password and username",ButtonType.OK);
			alert.show();
		}
		else
		{
			State
		}
	}

}
