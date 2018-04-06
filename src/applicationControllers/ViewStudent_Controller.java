package applicationControllers;

import application.DAO.AddStudentDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ViewStudent_Controller {
	Stage stage;
	Parent root1;
	@FXML
	private ListView<String> studentRollno,studentName_id,studentEmail_id,studentCourse_id,studentPaid_id,studentDue_id,studentContact_id;
	
	@FXML
	private Button backToAccountantSection,viewStudent,backToAddStudent,updateStudentFee;
	
	@FXML
	public void ViewStudent(ActionEvent event){
		AddStudentDAO addStudentDAO=new AddStudentDAO();
//		String[] stu_list_id=addStudentDAO.fetchID();
//		String[] stu_list_name=addStudentDAO.fetchName();
//		String[] stu_list_email=addStudentDAO.fetchEmail();
//		String[] stu_list_course=addStudentDAO.fetchCourse();
//		String[] stu_list_fee=addStudentDAO.fetchFee();
//		String[] stu_list_due=addStudentDAO.fetchDue();
//		String[] stu_list_contact=addStudentDAO.fetchContact();
		
		String[] stu_list_id=addStudentDAO.fetch("id");
		String[] stu_list_name=addStudentDAO.fetch("name");
		String[] stu_list_email=addStudentDAO.fetch("email");
		String[] stu_list_course=addStudentDAO.fetch("course");
		String[] stu_list_fee=addStudentDAO.fetch("fee");
		String[] stu_list_due=addStudentDAO.fetch("due");
		String[] stu_list_contact=addStudentDAO.fetch("contact");
		
		
		ObservableList<String> stu_listID=FXCollections.observableArrayList(stu_list_id);
		studentRollno.setItems(stu_listID);
		ObservableList<String> stu_listName=FXCollections.observableArrayList(stu_list_name);
		studentName_id.setItems(stu_listName);
		ObservableList<String> stu_listEmail=FXCollections.observableArrayList(stu_list_email);
		studentEmail_id.setItems(stu_listEmail);
		ObservableList<String> stu_listCourse=FXCollections.observableArrayList(stu_list_course);
		studentCourse_id.setItems(stu_listCourse);
		ObservableList<String> stu_listFee=FXCollections.observableArrayList(stu_list_fee);
		studentPaid_id.setItems(stu_listFee);
		ObservableList<String> stu_listDue=FXCollections.observableArrayList(stu_list_due);
		studentDue_id.setItems(stu_listDue);
		ObservableList<String> stu_listContact=FXCollections.observableArrayList(stu_list_contact);
		studentContact_id.setItems(stu_listContact);
		
		
		if(event.getSource()==backToAddStudent){
			System.out.println("Add Student Button Clicked in Admin Section...");
			stage=(Stage) backToAddStudent.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/AddStudent.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(event.getSource()==updateStudentFee){
			System.out.println("Add Student Button Clicked in Admin Section...");
			stage=(Stage) updateStudentFee.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/UpdateStudentFee.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(event.getSource()==backToAccountantSection){
			System.out.println("Back to Accountant Section Button Clicked in Admin Section...");
			stage=(Stage) backToAccountantSection.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/AccountantSection.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
