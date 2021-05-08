package eCommerce.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		
		if(user.getFirstName().length() >=2 && user.getLastName().length() >= 2) 
		{
			if(pattern.matcher(user.getMail()).matches()) {
				if(user.getPassword().length()>=6) {
					userDao.add(user);
					System.out.println("Kayýt baþarlý, lütfen e-mailinize gönderilen doðrulama kodunu onaylayýnýz..");
					
					return;
					
				}
				else {
					System.out.println("Þifreniz en az 6 karakter olmalýdýr...");
					return;
				}
			}
			else {
				System.out.println("E-Mail adresini eksik veya hatalý girdiniz..");
				return;
			}
		}
		else {
			System.out.println("Kullanýcý adý ve soyadý en az 2 karakter olmalýdýr...");
			return;
		}
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
