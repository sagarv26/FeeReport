package applicationControllers;


import application.DAO.AddAccountDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ViewAccountants_Controller  {
	Stage stage;
	Parent root1;
//	@FXML
//	private ListView<String> accountantList;
	@FXML
	private ListView<String> accountantListName,accountantListEmail,accountantListContact;
	@FXML
	private Button viewAcctButton;
	
	@FXML
	private Button backToAdd,backToAdminSectionFromView;
	
	@FXML
	public void ViewAccount(ActionEvent event){
	AddAccountDAO addAccountDAO=new AddAccountDAO();
//	List<String> acc_list=addAccountDAO.fetch();
//	String[] acc_list=addAccountDAO.fetch();
	String[] acc_list_name=addAccountDAO.fetchName();
	String[] acc_list_email=addAccountDAO.fetchEmail();
	String[] acc_list_contact=addAccountDAO.fetchContact();
//	int size=acc_list.size();
//	String[][] data=new String[size][3];
//	String data;
//	{
//	for(AddAccountantDTO aList:acc_list){
//		data="Name: "+aList.accName+"  Email: "+aList.accEmail+"  Contact: "+aList.accContact;
//		totalAcctanats.add(data);
//	}}
//
//	ObservableList<String> acct_list=FXCollections.observableArrayList(acc_list);
//	accountantList.setItems(acct_list);
	ObservableList<String> acct_listName=FXCollections.observableArrayList(acc_list_name);
	accountantListName.setItems(acct_listName);
	ObservableList<String> acct_listEmail=FXCollections.observableArrayList(acc_list_email);
	accountantListEmail.setItems(acct_listEmail);
	ObservableList<String> acct_listContact=FXCollections.observableArrayList(acc_list_contact);
	accountantListContact.setItems(acct_listContact);

	if(event.getSource()==backToAdd){
		System.out.println("Add Account Button Clicked in Admin Section...");
		stage=(Stage) backToAdd.getScene().getWindow();
		try {
			switchWindow("/xmlFiles/AddAccountants.fxml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	if(event.getSource()==backToAdminSectionFromView){
		System.out.println("Back to Admin Section Button Clicked in Admin Section...");
		stage=(Stage) backToAdminSectionFromView.getScene().getWindow();
		try {
			switchWindow("/xmlFiles/AdminSection.fxml");
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