package intro;

public class Main {
    public static void main(String[] args) {

        String internetSubeButonu = "İnternet Subesi";

        double dolarDun = 8.15;
        double dolarBugun = 8.15;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar düştü");
        } else if (dolarBugun < dolarDun) {
            System.out.println("Dolar yükselsi");
        } else {
            System.out.println("Dolar değişmedi");
        }

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Mutlu Emekli Kredisi";
        String kredi3 = "Konut Kredisi";
        String kredi4 = "Çiftçi Kredisi";
        String kredi5 = "Msb Kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);

        String[] krediler = { "Hizli Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi", "Msb Kredisi" };

        for (String kredi : krediler) {
            System.out.println(kredi);
        }
    }
}
