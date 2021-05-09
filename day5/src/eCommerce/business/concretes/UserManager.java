package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserCheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserCheckService userCheckService;
	private GoogleService googleService;
	List<User> users = new ArrayList<User>();

	public UserManager(UserDao userDao, UserCheckService userCheckService,GoogleService googleService ) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.googleService = googleService;
	}

	@Override
	public void signup(User user) {
		if (!userCheckService.checkfirstName(user.getFirstName()) || user.getFirstName() == null) {
			System.out.println("Ýsim en az 2 karakterden oluþmalýdýr.");
			return;
		}
		else if (!userCheckService.checklastName(user.getLastName()) || user.getLastName() == null) {
			System.out.println("Soyisim en az 2 karakterden oluþmalýdýr.");
			return;
		}
		else if (!userCheckService.checkEmail(user.getMail()) || user.getMail() == null) {
			System.out.println("Geçerli bir email giriniz.");
			return;
		}
		else if (!userCheckService.checkPassword(user.getPassword()) || user.getPassword() == null) {
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr.");
		}
		else if (userCheckService.isEmailInUse(user.getMail())) {
			System.out.println("Bu email kullanýlmaktadýr.");
		}
		else {
			userDao.add(user);
			System.out.println("Kayýt baþarýlý!");
			sendVerificationEmail(user.getMail());
		}
	}

	@Override
	public void login(String email, String password) {
		for (User user : userDao.getAll()) {
			if (user.getMail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Giriþ baþarýlý!");
				break;
			}
		}
		System.out.println("Email ya da þifre hatalý!");
	}

	@Override
	public void loginWithGoogle(String email, String password) {
		googleService.googleLoginToSystem(email, password);
	}
	
	@Override
	public void sendVerificationEmail(String email) {
		int verifyingCode = 1000+(int)(Math.random()* 9999);
		System.out.println("Doðrulama kodu gönderildi : " + email);
		System.out.println("Doðrulama kodu : " + verifyingCode);
		verifyEmail(verifyingCode);
	}

	@Override
	public void verifyEmail(int verifyingCode) {
		System.out.println("Doðrulama kodunu giriniz : ");
		Scanner scanner = new Scanner(System.in);
		
		if (scanner.nextInt() == verifyingCode) {
			System.out.println("Email doðrulandý.");
		}
		else {
			System.out.println("Doðrulama baþarýsýz.");
		}
		scanner.close();
	}

}
