package business;

import entity.User;

public class UserManager {
   
	public void insert(User user) {
		System.out.println(user.getUserName()+" "+user.getUserSurname()+" inserted.");
	}
	public void delete(User user){
		System.out.println(user.getUserName()+" "+ user.getUserSurname()+" deleted.");
	}
	public void updateMail(User user, String newMail) {
		user.setUserMail(newMail);
		System.out.println("id: "+user.getUserID()+", new mail: "+user.getUserMail()+" mail updated");
	}
}
