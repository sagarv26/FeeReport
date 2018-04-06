package application.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Accountants")
public class AddAccountantDTO implements Serializable {
	public AddAccountantDTO(){
//		System.out.println("AddAccountDTO Created");
	}
	public AddAccountantDTO(String accName,String accPassword,String accContact,String accEmail ) {
		this.accName=accName;
		this.accPassword=accPassword;
		this.accContact=accContact;
		this.accEmail=accEmail;	

	}

	@Id
	@GenericGenerator(name="id",strategy="increment")
	@GeneratedValue(generator="id")
	@Column(name="acct_id")
	public int accId;
	@Column(name="acct_name")
	public String accName;
	@Column(name="acct_password")
	public String accPassword;
	@Column(name="acct_email")
	public String accEmail;
	@Column(name="acct_contact")
	public String accContact;
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	public String getAccEmail() {
		return accEmail;
	}
	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}
	public String getAccContact() {
		return accContact;
	}
	public void setAccContact(String accContact) {
		this.accContact = accContact;
	}
	
	
}
