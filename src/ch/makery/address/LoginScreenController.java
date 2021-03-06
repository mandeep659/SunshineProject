package ch.makery.address;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import ch.makery.address.model.User;

public class LoginScreenController extends Controller{
	private String username;
	private String password;
	@FXML
	private TextField userField;
	@FXML
	private PasswordField passField;
	User testUser = new User("fab","123");
	
	Button logButton;
	
	 public LoginScreenController() {
	 }
	 
	 
	 public Button getLogButton() {
			return logButton;
		}

		public void setLogButton(Button logButton) {
			this.logButton = logButton;
		}
	 
	private void getData() {
		this.username = userField.getText();
		this.password = passField.getText();
	}
		
	
	 public void clickLoginButton(ActionEvent event) {
		 event.consume();
		 getData();
		 login(); 
	    }
	     
	 private void login() {
		 System.out.println("Logging in...");
		 boolean flag = validate();
		 if (flag==true) {
			 System.out.print("Hello,");
		     System.out.println(userField.getText());
		     mainApp.showMenu();
		 }
		 else {
			 System.out.println("Username or password wrong.");
		 }
		 
	 }
	 
	 private boolean validate() {
		 String aux1 = testUser.getUsername();
		 String aux2 = testUser.getPassword();
 
		 if((aux1.equals(this.username))&&(aux2.equals(this.password))) {
			 
			 return true;
		 }
		 else {
			
			 return false;
		 }
		 
	 }
}
