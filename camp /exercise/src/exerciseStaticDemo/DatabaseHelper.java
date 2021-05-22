package exerciseStaticDemo;
//inner class 

public class DatabaseHelper {

    public static class Crud { // Crud>>> Create read update delete

        public static void Delete() {
            System.out.println("Silindi");
        }

        public static void Update() {
            System.out.println("Güncellendi");
        }
    }

    public static class Connection {

        public static void createConnetion() {
            System.out.println("Bağlantı oluşturuldu");
        }
    }
}
