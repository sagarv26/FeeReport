package application.DTO;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Students")
public class AddStudentDTO implements Serializable{

	public AddStudentDTO(){
		
	}
    public AddStudentDTO(String stuName,String stuEmail,String stuCourse,String stuFee,String stuDue,String stuAddress,String stuCity,String stuState,String stuCountry,String stuContact){
		this.stuName=stuName;
		this.stuEmail=stuEmail;
		this.stuCourse=stuCourse;
		this.stuFee=stuFee;
		this.stuDue=stuDue;
		this.stuAddress=stuAddress;
		this.stuCity=stuCity;
		this.stuState=stuState;
		this.stuCountry=stuCountry;
		this.stuContact=stuContact;
	}
    
    @Id
    @GenericGenerator(name="id", strategy="increment")
	@GeneratedValue(generator="id")
    @Column(name="stu_id")
	private int stuID;
    @Column(name="stu_name")
	private String stuName;
    @Column(name="stu_email")
	private String stuEmail;
    @Column(name="stu_course")
	private String stuCourse;
    @Column(name="stu_fee")
	private String stuFee;
    @Column(name="stu_due")
	private String stuDue;
    @Column(name="stu_address")
	private String stuAddress;
    @Column(name="stu_city")
	private String stuCity;
    @Column(name="stu_state")
	private String stuState;
    @Column(name="stu_country")
	private String stuCountry;
    @Column(name="stu_contact")
	private String stuContact;
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuEmail() {
		return stuEmail;
	}
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}
	public String getStuCourse() {
		return stuCourse;
	}
	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}
	public String getStuFee() {
		return stuFee;
	}
	public void setStuFee(String stuFee) {
		this.stuFee = stuFee;
	}
	public String getStuDue() {
		return stuDue;
	}
	public void setStuDue(String stuDue) {
		this.stuDue = stuDue;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	public String getStuState() {
		return stuState;
	}
	public void setStuState(String stuState) {
		this.stuState = stuState;
	}
	public String getStuCountry() {
		return stuCountry;
	}
	public void setStuCountry(String stuCountry) {
		this.stuCountry = stuCountry;
	}
	public String getStuContact() {
		return stuContact;
	}
	public void setStuContact(String stuContact) {
		this.stuContact = stuContact;
	}
    
    
}
