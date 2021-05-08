package exerciseInheritance;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        System.out.println("Customer: ");
        System.out.println(customer.id = 1);
        System.out.println(customer.age = 20);
        System.out.println(customer.firstName = "Ali");
        System.out.println(customer.lastName = "Yıldırım");
        System.out.println(customer.email = "örnek@gmail.com");
        System.out.println("-------------------------------------");
        System.out.println("Employee: ");
        System.out.println(employee.id = 1);
        System.out.println(employee.age = 20);
        System.out.println(employee.firstName = "Ali");
        System.out.println(employee.lastName = "Yıldırım");
        System.out.println(employee.salary = 3150.75);
        System.out.println("-------------------------------------");
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        System.out.println("EmployeeManager: ");
        employeeManager.add();
        employeeManager.list();
        employeeManager.bestEmployee();
        System.out.println("-------------------------------------");
        System.out.println("CustomerManager: ");
        customerManager.add();
        customerManager.list();

    }
}
