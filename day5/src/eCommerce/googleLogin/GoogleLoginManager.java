package eCommerce.googleLogin;

import java.util.regex.Pattern;

import eCommerce.entities.concretes.User;

public class GoogleLoginManager {

	public void add(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
			if(pattern.matcher(user.getMail()).matches()) {
				if(user.getPassword().length()>=6) {
					System.out.println("Google ile giri� ba�ar�l�.. ");
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
}
