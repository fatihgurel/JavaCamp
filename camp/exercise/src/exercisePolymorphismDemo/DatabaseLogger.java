package exercisePolymorphismDemo;

public class DatabaseLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("Logged to databese : " + message);
    }
}
