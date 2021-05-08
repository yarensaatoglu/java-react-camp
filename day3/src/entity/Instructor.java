package entity;

public class Instructor extends User{
     private String courseName;

	public Instructor(int userID, String userName, String userSurname, String userMail, String userPasword,
			String courseName) {
		super(userID, userName, userSurname, userMail, userPasword);
		this.courseName = courseName;
	}
	
	public Instructor() {};

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	} 
}
