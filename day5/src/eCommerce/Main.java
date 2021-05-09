package eCommerce;

import java.util.List;
import java.util.Scanner;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserCheckManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.core.concretes.GoogleLoginManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Yaren", "Saatoglu", "yarensaatoglu@gmail.com", "123456");
		UserManager userManager = new UserManager(new HibernateUserDao(), new UserCheckManager(new HibernateUserDao()), new GoogleLoginManagerAdapter());
		userManager.signup(user);
		
		userManager.loginWithGoogle("yarensaatoglu@gmail.com", "123456");
	}

}
