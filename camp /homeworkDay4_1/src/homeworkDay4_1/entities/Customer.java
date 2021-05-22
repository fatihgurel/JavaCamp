package homeworkDay4_1.entities;
 
import java.util.Date;

import homeworkDay4_1.abstracts.IEntity;

public class Customer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private Date dateofBirth;
	private String nationaltyId;

	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, Date dateofBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationaltyId = nationaltyId;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
}
