package eCommerce.googleLogin;

import java.util.regex.Pattern;

import eCommerce.entities.concretes.User;

public class GoogleLoginManager {

	public void add(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
			if(pattern.matcher(user.getMail()).matches()) {
				if(user.getPassword().length()>=6) {
					System.out.println("Google ile giriþ baþarýlý.. ");
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
}
