package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchWindow {
	Stage stage;
	Parent root1;
	
	public void SwitchWin(String window)throws Exception{
		//load up OTHER FXML document			
	    root1=FXMLLoader.load(getClass().getResource(window));	
	    Scene scene1 = new Scene(root1);
		stage.setFullScreen(true);
		stage.setMaximized(true);
	    stage.setScene(scene1);
	    stage.show();	
	}

}
