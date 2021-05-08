package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	public void delete(User user);
}
