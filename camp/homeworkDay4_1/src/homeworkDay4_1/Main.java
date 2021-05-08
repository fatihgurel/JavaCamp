package homeworkDay4_1;

import java.util.Calendar;
import java.util.Date;

import homeworkDay4_1.abstracts.BaseCustomerManager;
import homeworkDay4_1.adapters.MernisServiceAdapter;
import homeworkDay4_1.concrete.NeroCustomerManager;
import homeworkDay4_1.concrete.StarbucksCustomerManager;
import homeworkDay4_1.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"FATİH", "GÜREL", new Date(1999,1,7) , "63919206758"));
		
		
	}

}