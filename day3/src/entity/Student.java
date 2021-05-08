package entity;

public class Student extends User{
   private String schoolName;
   private String educationStatus;
   
public Student(int userID, String userName, String userSurname, String userMail, String userPasword, String schoolName,
		String educationStatus) {
	super(userID, userName, userSurname, userMail, userPasword);
	this.schoolName = schoolName;
	this.educationStatus = educationStatus;
}
public Student() {};

public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public String getEducationStatus() {
	return educationStatus;
}
public void setEducationStatus(String educationStatus) {
	this.educationStatus = educationStatus;
}
   
}
