package entities;

public class Customer {
	private int CustomerID;
	private String FirstName;
	private String LastName;
	private String DateOfBirth;
	private String NatinalityID;
	
	public Customer(int customerID, String firstName, String lastName, String dateOfBirth, String natinalityID) {
		CustomerID = customerID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NatinalityID = natinalityID;
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
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNatinalityID() {
		return NatinalityID;
	}
	public void setNatinalityID(String natinalityID) {
		NatinalityID = natinalityID;
	}
	
	

}
