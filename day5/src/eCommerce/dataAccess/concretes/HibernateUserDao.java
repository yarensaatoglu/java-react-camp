package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" silindi");
	}

}
