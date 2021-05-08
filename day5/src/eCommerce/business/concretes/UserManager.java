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
					System.out.println("Kay�t ba�arl�, l�tfen e-mailinize g�nderilen do�rulama kodunu onaylay�n�z..");
					
					return;
					
				}
				else {
					System.out.println("�ifreniz en az 6 karakter olmal�d�r...");
					return;
				}
			}
			else {
				System.out.println("E-Mail adresini eksik veya hatal� girdiniz..");
				return;
			}
		}
		else {
			System.out.println("Kullan�c� ad� ve soyad� en az 2 karakter olmal�d�r...");
			return;
		}
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
