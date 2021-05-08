package entities;

public class Customer {

	private int CustomerID;
	private String FirstName;
	private String LastName;
	private int BirthDayYear;
	private String Email;
	private String Password;
	
	
	public Customer(int customerID, String firstName, String lastName, int birthDayYear, String email,
			String password) {
		super();
		CustomerID = customerID;
		FirstName = firstName;
		LastName = lastName;
		BirthDayYear = birthDayYear;
		Email = email;
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getBirthDayYear() {
		return BirthDayYear;
	}
	public void setBirthDayYear(int birthDayYear) {
		BirthDayYear = birthDayYear;
	}
	
}
