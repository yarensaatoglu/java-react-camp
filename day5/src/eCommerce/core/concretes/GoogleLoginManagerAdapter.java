package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleService;
import eCommerce.entities.concretes.User;
import eCommerce.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements GoogleService{

	@Override
	public void googleLoginToSystem(String email,String password) {
		GoogleLoginManager manager = new GoogleLoginManager();
		manager.add(email, password);	
	}

}
