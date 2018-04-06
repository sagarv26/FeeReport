package applicationControllers;

import application.DAO.AddStudentDAO;
import application.DTO.AddStudentDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class AddStudent {
	Stage stage;
	Parent root1;
	
	@FXML
	private TextField studentName,studentEmail,studentCourse,studentFee,studentDue,studentAddress,studentCity,studentState,studentCountry,studentContact;

	@FXML
	private Button addStudent,backToStudentView,backToStudentSection;
	
	@FXML
	public void AddStudentInfo(ActionEvent event){
		if(event.getSource()==addStudent){
			System.out.println("Add Student Button Clicked in Accountant Section...");
			String stu_Name=getValue(studentName);
			String stu_Email=getValue(studentEmail);
			String stu_Course=getValue(studentCourse);
			String stu_Fee=getValue(studentFee);
			String stu_Due=getValue(studentDue);
			String stu_Address=getValue(studentAddress);
			String stu_City=getValue(studentCity);
			String stu_State=getValue(studentState);
			String stu_Country=getValue(studentCountry);
			String stu_Contact=getValue(studentContact);
			
			
			AddStudentDTO addStudentDTO=new AddStudentDTO(stu_Name,stu_Email,stu_Course,stu_Fee,stu_Due,stu_Address,stu_City,stu_State,stu_Country,stu_Contact);
			AddStudentDAO addStudentDAO=new AddStudentDAO();
			addStudentDAO.Create(addStudentDTO);
			System.out.println("Student has been added "+"Name : "+stu_Name+" Email : "+stu_Email+" Course : "+stu_Course+" Fee : "+stu_Fee+" Due : "+stu_Due+" Address : "+stu_Address+" City : "+stu_City+" Country :  "+stu_Country+" Contact : "+stu_Contact );
			
		}else if(event.getSource()==backToStudentView){
			System.out.println("View Student Button Clicked in Accountant Section...");
			stage=(Stage) backToStudentView.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/AdminSection.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}else if(event.getSource()==backToStudentSection){
			System.out.println("Back Button Clicked in Accountant Section...");
			stage=(Stage) backToStudentSection.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/AccountantSection.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getValue(TextField text){
		return text.getText().toString();
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
