package eCommerce.core.abstracts;

import eCommerce.entities.concretes.User;

public interface GoogleService {

	void googleLoginToSystem(String email,String password);
}
