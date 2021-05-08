package concretes;

import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService{
	CustomerCheckManager customerCheckManager;
	

	public CustomerManager(CustomerCheckManager customerCheckManager) {
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void add(Customer customer) {
		System.out.println("Added :"+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted :"+ customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated :"+ customer.getFirstName());
		
	}

}
