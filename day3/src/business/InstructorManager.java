package business;

import entity.User;

public class InstructorManager extends UserManager{
	@Override
	public void insert(User user) {
		System.out.println(user.getUserName()+" "+user.getUserSurname()+" (instructor) inserted.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" "+ user.getUserSurname()+" (instructor) deleted.");
	}
	
	@Override
	public void updateMail(User user, String newMail) {
		System.out.print("(instructor)");
		super.updateMail(user, newMail);
	}
}
