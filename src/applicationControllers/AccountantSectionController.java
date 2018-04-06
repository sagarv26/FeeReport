package applicationControllers;

import application.SwitchWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AccountantSectionController {
	Stage stage;
	Parent root1;
	SwitchWindow switchWindow;
	@FXML
	private Button addStudent,viewStudent,editStudent,dueFee,accountantLogout;
	@FXML
	public void AdminSection(ActionEvent event)throws Exception{
		if(event.getSource()==addStudent){
			System.out.println("Add Student Button Clicked in Admin Section...");
			stage=(Stage) addStudent.getScene().getWindow();
			switchWindow("/xmlFiles/AddStudent.fxml");
		}else if(event.getSource()==viewStudent){
			System.out.println("View Student Button Clicked in Admin Section...");
			stage=(Stage) viewStudent.getScene().getWindow();
			switchWindow("/xmlFiles/ViewStudent.fxml");	
		}else if(event.getSource()==editStudent){
			System.out.println("Edit Student Button Clicked in Admin Section...");
			stage=(Stage) editStudent.getScene().getWindow();
			switchWindow("/xmlFiles/UpdateStudentFee.fxml");
		}else if(event.getSource()==dueFee){
			System.out.println("Due Fee Button Clicked in Admin Section...");
			stage=(Stage) dueFee.getScene().getWindow();
			switchWindow("/xmlFiles/AddStudent.fxml");
		}else if(event.getSource()==accountantLogout){
			System.out.println("Student Logout Button Clicked in Admin Section...");
			stage=(Stage) accountantLogout.getScene().getWindow();
			switchWindow("/xmlFiles/welcomePage.fxml");}		
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
