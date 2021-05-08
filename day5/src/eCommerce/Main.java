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
		System.out.println("Hoþgeldiniz..");
		System.out.println("1-Kayýt olmak");
		System.out.println("2-Google ile kayýt olmak");
		System.out.println("3-Giriþ yapmak");
		System.out.println("Ýþlem seçiniz ve seçilen iþlemin numarasýný giriniz..(örneðin, 2)");
		int islem = girdi.nextInt();
		if(islem == 1) {
			System.out.print("Kullanýcý Adi: ");
			String firstName = girdi.next();
			System.out.print("Kullanýcý Soyadi: ");
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
			System.out.println("Hatalý islem secimi tekrar deneyiniz..");
		}
	}

}
