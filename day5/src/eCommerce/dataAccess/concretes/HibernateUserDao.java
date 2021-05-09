package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> allUser = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() +" eklendi");
		allUser.add(user);
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" silindi");
	}
	@Override
	public List<User> getAll() {
		return allUser;
	}

	@Override
	public User getOne(int id) {
		for(User user : allUser) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;
	}

}
