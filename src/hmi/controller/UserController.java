package hmi.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class UserController {

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnRegister1;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Label lblAddress;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblGender;

    @FXML
    private Label lblMobile;

    @FXML
    private Label lblMobile1;

    @FXML
    private Label lblUsername;

    @FXML
    private TextField txtAddress;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtEmail;

    @FXML
    private RadioButton txtFemale;

    @FXML
    private RadioButton txtMale;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtMobile1;

    @FXML
    private TextField txtUsername;

    @FXML
    void regclick(ActionEvent event) {

    }

}
