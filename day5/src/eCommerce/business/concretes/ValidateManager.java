package eCommerce.business.concretes;

import eCommerce.business.abstracts.ValidateService;

public class ValidateManager implements ValidateService{

	@Override
	public void userValidate(boolean isValid) {
		if(isValid) {
			System.out.println("Doğrulama başarılıdır.");
		}
		else {
			System.out.println("Doğrulama hatalıdır.");
		}
		
	}

}
