package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	public void delete(User user);
	public List<User> getAll();
	public User getOne(int id);
}
