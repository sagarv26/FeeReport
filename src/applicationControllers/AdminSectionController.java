package applicationControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class AdminSectionController {
	Stage stage;
	Parent root1;
	@FXML
	private Button addAccount,adminLogout,viewAccount;
	@FXML
	public void AdminSection(ActionEvent event)throws Exception{
		if(event.getSource()==addAccount){
			System.out.println("Add Account Button Clicked in Admin Section...");
			stage=(Stage) addAccount.getScene().getWindow();
			switchWindow("/xmlFiles/AddAccountants.fxml");
			
		}else if(event.getSource()==adminLogout){
			System.out.println("Admin Logout Button Clicked in Admin Section...");
			stage=(Stage) adminLogout.getScene().getWindow();
			switchWindow("/xmlFiles/welcomePage.fxml");
			
		}else if(event.getSource()==viewAccount){
			System.out.println("View Account Button Clicked in Admin Section...");
			stage=(Stage) viewAccount.getScene().getWindow();
			switchWindow("/xmlFiles/ViewAccountants.fxml");
			
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
