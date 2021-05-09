package eCommerce.business.abstracts;

public interface UserCheckService {
	boolean checkPassword(String password);
	boolean checkEmail(String email);
	boolean checkfirstName(String firstName);
	boolean checklastName(String lastName);
	boolean isEmailInUse(String email);
}
