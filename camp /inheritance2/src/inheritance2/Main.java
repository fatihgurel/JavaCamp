package inheritance2;

public class Main {
//Day3 
    public static void main(String[] args) {
//        LogManager logManager = new LogManager();
//        logManager.log(1);
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());
    }

}
