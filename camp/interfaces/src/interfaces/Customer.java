package interfaces;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }
        public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.firstName = lastName;
    }
}
