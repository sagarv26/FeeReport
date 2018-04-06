package applicationControllers;

import application.DAO.AddAccountDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginAccountant {
	
	Stage stage;
	Parent root1;
	@FXML
	private TextField accountantLoginName,accountantLoginPassword;
	@FXML
	private Button loginAccountantButton;
	@FXML
	private Label loginStatus;
	
	public void LoginAccountantController(ActionEvent event)throws Exception{
		if(event.getSource()==loginAccountantButton){
			stage=(Stage)loginAccountantButton.getScene().getWindow();
			String acct_Login_Name=accountantLoginName.getText().toString().trim();
			String acct_Login_Password=accountantLoginPassword.getText().toString().trim();
			AddAccountDAO accountantDAO=new AddAccountDAO();
			int status=accountantDAO.ValidateAcctLogin(acct_Login_Name, acct_Login_Password);
			if(status!=0){
				 //load up OTHER FXML document			
		        root1=FXMLLoader.load(getClass().getResource("/xmlFiles/AccountantSection.fxml"));	
		        Scene scene1 = new Scene(root1);
			    stage.setScene(scene1);
			    stage.show();
			}else{
				loginStatus.setText("InValid Credentials");
			}
			
		}
		
	}

}
