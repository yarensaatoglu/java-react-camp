package eCommerce.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserCheckService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

private UserDao userDao;
	
	public UserCheckManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() >= 6) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	@Override
	public boolean checkfirstName(String firstName) {
		if (firstName.length() > 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checklastName(String lastName) {
		if (lastName.length() > 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailInUse(String email) {
		List<User> users = userDao.getAll();
		for (User user : users) {
			if (user.getMail().equals(email)) {
				return true;
			}
		}
		return false;
	}
}
