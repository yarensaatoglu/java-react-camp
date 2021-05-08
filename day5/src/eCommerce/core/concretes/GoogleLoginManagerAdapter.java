package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleService;
import eCommerce.entities.concretes.User;
import eCommerce.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements GoogleService{

	@Override
	public void googleLoginToSystem(User user) {
		GoogleLoginManager manager = new GoogleLoginManager();
		manager.add(user);	
	}

}
