package business;

import entity.User;

public class StudentManager extends UserManager {

	@Override
	public void insert(User user) {
		System.out.println(user.getUserName()+" "+user.getUserSurname()+" (student) inserted.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" "+ user.getUserSurname()+" (student) deleted.");
	}

	@Override
	public void updateMail(User user, String newMail) {
		System.out.print("(student)");
		super.updateMail(user, newMail);
	}
    
}
