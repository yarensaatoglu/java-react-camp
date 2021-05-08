package eCommerce.business.concretes;

import eCommerce.business.abstracts.ValidateService;

public class ValidateManager implements ValidateService{

	@Override
	public void userValidate(boolean isValid) {
		if(isValid) {
			System.out.println("Doðrulama baþarýlýdýr.");
		}
		else {
			System.out.println("Doðrulama hatalýdýr.");
		}
		
	}

}
