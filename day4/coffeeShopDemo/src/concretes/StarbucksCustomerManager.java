package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	@Override
	public void save(Customer customer) {
		try {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				super.save(customer);
			}
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	

   
}
