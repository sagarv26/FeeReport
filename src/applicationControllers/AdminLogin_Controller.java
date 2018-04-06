package applicationControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLogin_Controller {
	Stage stage;
	Parent root1;
	@FXML
	private TextField adminName,adminPassword;
	@FXML
	private Button adminButton;
	@FXML
	private Label adminStatus;

	@FXML
	public void AdminLogin(ActionEvent event) throws Exception{
		if(event.getSource()==adminButton){
			System.out.println("Admin Button Clicked in AdminLogin...");
		if(adminName.getText().equals("admin")&&adminPassword.getText().equals("admin123")){
			adminStatus.setText("Login Success....");
			stage=(Stage) adminButton.getScene().getWindow();
	        //load up OTHER FXML document			
	        root1=FXMLLoader.load(getClass().getResource("/xmlFiles/AdminSection.fxml"));	
	        Scene scene1 = new Scene(root1);
			stage.setFullScreen(true);
			stage.setMaximized(true);
		    stage.setScene(scene1);
		    stage.show();
		}else{
			adminStatus.setText("InValid Credentials!!!!!!");
		}}
		
}
	public void switchWindow(String File) throws Exception{
		//load up OTHER FXML document			
	    root1=FXMLLoader.load(getClass().getResource(File));	
	    Scene scene1 = new Scene(root1);
		stage.setFullScreen(true);
		stage.setMaximized(true);
	    stage.setScene(scene1);
	    stage.show();
	}
}
