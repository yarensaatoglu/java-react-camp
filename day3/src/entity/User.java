package entity;
public class User {
	private int userID;
    private String userName;
    private String userSurname;
    private String userMail;
    private String userPasword;
    
	public User(int userID, String userName, String userSurname, String userMail, String userPasword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userMail = userMail;
		this.userPasword = userPasword;
	}
	
	public User() {};
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPasword() {
		return userPasword;
	}
	public void setUserPasword(String userPasword) {
		this.userPasword = userPasword;
	}
}
