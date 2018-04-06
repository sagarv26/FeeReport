package applicationControllers;

import application.DAO.AddStudentDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpdateStudentFee_Controller {
	Stage stage;
	Parent root1;
	@FXML
	private TextField studentId,studentName,studentEmail,studentCourse,studentFee,studentDue,studentAddress,studentCity,studentState,studentCountry,studentContact;

	@FXML
	private Button updateStudent,backToStudentView,backToStudentSection,loadRecord;
	
	@FXML
	public void UpdateStudentInfo(ActionEvent event){
	
			AddStudentDAO addStudentDAO=new AddStudentDAO();
			System.out.println("Update Student Button Clicked in Accountant Section...");
			String stu_Id=getValue(studentId);
			
			if(event.getSource()==loadRecord){
			String stu_name=addStudentDAO.fetchToUpdate("name", Integer.valueOf(stu_Id));
			studentName.setText(stu_name);
			String stu_Email=addStudentDAO.fetchToUpdate("email", Integer.valueOf(stu_Id));
			studentEmail.setText(stu_Email);
			String stu_Course=addStudentDAO.fetchToUpdate("course", Integer.valueOf(stu_Id));
			studentCourse.setText(stu_Course);
			String stu_Fee=addStudentDAO.fetchToUpdate("fee", Integer.valueOf(stu_Id));
			studentFee.setText(stu_Fee);
			String stu_Due=addStudentDAO.fetchToUpdate("due", Integer.valueOf(stu_Id));
			studentDue.setText(stu_Due);
			String stu_Address=addStudentDAO.fetchToUpdate("address", Integer.valueOf(stu_Id));
			studentAddress.setText(stu_Address);
			String stu_City=addStudentDAO.fetchToUpdate("city", Integer.valueOf(stu_Id));
			studentCity.setText(stu_City);
			String stu_State=addStudentDAO.fetchToUpdate("state", Integer.valueOf(stu_Id));
			studentState.setText(stu_State);
			String stu_Country=addStudentDAO.fetchToUpdate("country", Integer.valueOf(stu_Id));
			studentCountry.setText(stu_Country);
			String stu_Contact=addStudentDAO.fetchToUpdate("contact", Integer.valueOf(stu_Id));
			studentContact.setText(stu_Contact);
			}
			if(event.getSource()==updateStudent){
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
			
			
			addStudentDAO.UpdateStudentData(stu_Name, stu_Email, stu_Course, stu_Fee, stu_Due, stu_Address, stu_City, stu_State, stu_Country, stu_Contact, stu_Id);
			System.out.println("Data Updated....");
			}else if(event.getSource()==backToStudentView){
			System.out.println("View Student Button Clicked in Accountant Section...");
			stage=(Stage) backToStudentView.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/ViewStudent.fxml");
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
