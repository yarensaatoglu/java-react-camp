package main;

import business.InstructorManager;
import business.StudentManager;
import entity.Instructor;
import entity.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Yaren","Saato�lu","yarensaatoglu@gmail.com","123","OM�","bachelor's degree ");
		//Other way
		Student student2 = new Student();
		student2.setUserID(2);
		student2.setUserName("Ay�e");
		student2.setUserSurname("Kaya");
		student2.setUserMail("ayse@gmail.com");
		student2.setUserPasword("987654");
		student2.setSchoolName("ODT�");
		student2.setEducationStatus("bachelor's degree ");
		
		
		Instructor instructor = new Instructor(1,"Engin","Demiro�","engindemirog@..","123456","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
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
