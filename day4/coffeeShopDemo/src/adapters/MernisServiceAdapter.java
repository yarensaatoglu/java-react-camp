package adapters;


import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		try {
			KPSPublicSoapProxy client= new KPSPublicSoapProxy();
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNatinalityID()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),Integer.parseInt(customer.getDateOfBirth()));
		
		}
		catch (Exception e) {
			System.out.print(e);
			return false;
		}
	}

}
