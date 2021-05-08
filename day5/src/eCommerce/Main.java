package eCommerce;

import java.util.List;
import java.util.Scanner;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.core.concretes.GoogleLoginManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		int id = 1;
		Scanner girdi = new Scanner(System.in);
		System.out.println("Ho�geldiniz..");
		System.out.println("1-Kay�t olmak");
		System.out.println("2-Google ile kay�t olmak");
		System.out.println("3-Giri� yapmak");
		System.out.println("��lem se�iniz ve se�ilen i�lemin numaras�n� giriniz..(�rne�in, 2)");
		int islem = girdi.nextInt();
		if(islem == 1) {
			System.out.print("Kullan�c� Adi: ");
			String firstName = girdi.next();
			System.out.print("Kullan�c� Soyadi: ");
			String lastName = girdi.next();
			System.out.print("Email: ");
			String mail = girdi.next();
			System.out.print("Sifre: ");
			String password = girdi.next();
			User user = new User(id,firstName,lastName,mail,password);
			UserService manager = new  UserManager(new HibernateUserDao());
			manager.add(user);
			id++;
		}
		else if(islem == 2) {
			System.out.print("Email: ");
			String mail = girdi.next();
			System.out.print("Sifre: ");
			String password = girdi.next();
			User user = new User(id," "," ",mail,password);
			GoogleService manager = new  GoogleLoginManagerAdapter();
			manager.googleLoginToSystem(user);
			id++;
		}
		else if(islem==3)
		{
			System.out.print("Email: ");
			String mail = girdi.next();
			System.out.print("Sifre: ");
			String password = girdi.next();
			
		}
		else {
			System.out.println("Hatal� islem secimi tekrar deneyiniz..");
		}
	}

}
