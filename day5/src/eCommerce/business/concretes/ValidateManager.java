package eCommerce.business.concretes;

import eCommerce.business.abstracts.ValidateService;

public class ValidateManager implements ValidateService{

	@Override
	public void userValidate(boolean isValid) {
		if(isValid) {
			System.out.println("Do�rulama ba�ar�l�d�r.");
		}
		else {
			System.out.println("Do�rulama hatal�d�r.");
		}
		
	}

}
