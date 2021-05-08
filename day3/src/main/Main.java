package main;

import business.InstructorManager;
import business.StudentManager;
import entity.Instructor;
import entity.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Yaren","Saatoğlu","yarensaatoglu@gmail.com","123","OMÜ","bachelor's degree ");
		//Other way
		Student student2 = new Student();
		student2.setUserID(2);
		student2.setUserName("Ayşe");
		student2.setUserSurname("Kaya");
		student2.setUserMail("ayse@gmail.com");
		student2.setUserPasword("987654");
		student2.setSchoolName("ODTÜ");
		student2.setEducationStatus("bachelor's degree ");
		
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ","engindemirog@..","123456","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		StudentManager sManagaer = new StudentManager();
		sManagaer.insert(student);
		sManagaer.updateMail(student, "newmail@gmail.com");
		sManagaer.delete(student);
		
		StudentManager sManagaer2 = new StudentManager();
		sManagaer2.insert(student2);
		sManagaer2.updateMail(student2, "newmail2@gmail.com");
		sManagaer2.delete(student2);
		
		InstructorManager iManager = new InstructorManager();
		iManager.insert(instructor);
		iManager.updateMail(instructor, "newmail3@gmil.com");
		iManager.delete(instructor);

	}

}
