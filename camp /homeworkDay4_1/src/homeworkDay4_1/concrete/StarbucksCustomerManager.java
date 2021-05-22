package homeworkDay4_1.concrete;
 
import homeworkDay4_1.abstracts.BaseCustomerManager;
import homeworkDay4_1.abstracts.ICustomerCheckService;
import homeworkDay4_1.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {

			super.save(customer);

		} else {

			System.out.println("Not a valid person");
		}

	}

}