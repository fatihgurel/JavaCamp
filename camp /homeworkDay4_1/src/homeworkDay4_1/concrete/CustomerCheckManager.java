package homeworkDay4_1.concrete;
 
import homeworkDay4_1.abstracts.ICustomerCheckService;
import homeworkDay4_1.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}
	
	
	
}
