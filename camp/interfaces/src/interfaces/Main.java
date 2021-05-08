package interfaces;

public class Main {
//Day4

    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer engin = new Customer(1, "Engin", "Deniroğ");
        customerManager.add(engin);
    }

}
