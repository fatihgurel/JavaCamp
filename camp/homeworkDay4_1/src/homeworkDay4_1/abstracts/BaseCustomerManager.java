package homeworkDay4_1.abstracts;

import homeworkDay4_1.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}
	
	
	
}
