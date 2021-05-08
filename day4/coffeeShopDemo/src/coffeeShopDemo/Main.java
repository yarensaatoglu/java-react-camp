package coffeeShopDemo;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "Yaren", "Saato�lu", "1999", "tc yaz�lmal�"));
	}

}
