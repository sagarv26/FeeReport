package applicationControllers;

import application.DAO.AddAccountDAO;
import application.DTO.AddAccountantDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddAccountant {
	Stage stage;
	Parent root1;
	@FXML
	private TextField accountantName,accountantPassword,accountantContact,accountantEmail;

	@FXML
	private Button addAccount,backToView,backToAdminSection;
	
	@FXML
	public void AddAccountantInfo(ActionEvent event){
		if(event.getSource()==addAccount){
			System.out.println("Add Account Button Clicked...");
			String acctName=getValue(accountantName);
			String acctPassword=getValue(accountantPassword);
			String acctContact=getValue(accountantContact);
			String acctEmail=getValue(accountantEmail);
			
			AddAccountantDTO addAccountDTO=new AddAccountantDTO(acctName,acctPassword,acctContact,acctEmail);

			AddAccountDAO addAccountDAO=new AddAccountDAO();
			addAccountDAO.create(addAccountDTO);
			System.out.println("Account has been Added "+"Name: "+acctName+" Contact: "+acctContact+" Email: "+acctEmail);		
					}
		if(event.getSource()==backToAdminSection){
			System.out.println("ViewAccountants Account Button Clicked in Admin Section...");
			stage=(Stage) backToAdminSection.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/AdminSection.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		if(event.getSource()==backToView){
			System.out.println("Back Button Clicked in Admin Section...");
			stage=(Stage) backToView.getScene().getWindow();
			try {
				switchWindow("/xmlFiles/ViewAccountants.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		
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
