package applicationControllers;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Welcome_Controller {
	Stage stage;
	Parent root1;	
	@FXML
	private Button userButton;	
	@FXML
	private Button adminButton;
	
	@FXML
	public void Switch(ActionEvent event)throws Exception{
		if(event.getSource()==adminButton){
			System.out.println("Admin Button Clicked...");
			stage=(Stage) adminButton.getScene().getWindow();
	        switchWindow("/xmlFiles/loginAdmin.fxml");						
	      }else if(event.getSource()==userButton){
	    	  System.out.println("User Button Clicked...");
				stage=(Stage) userButton.getScene().getWindow();
		        switchWindow("/xmlFiles/LoginAccountant.fxml"); 
	      }
		
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
