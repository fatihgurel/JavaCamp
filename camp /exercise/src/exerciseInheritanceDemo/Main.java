package exerciseInheritanceDemo;
 
public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        System.out.println("Öğretmen Kredisi: ");
        krediUI.KrediHesapla(new OgretmenKrediManager());
        System.out.println("----------------------------");
        System.out.println("Tarım Kredisi: ");
        krediUI.KrediHesapla(new TarimKrediManager());
        System.out.println("----------------------------");
        System.out.println("Asker Kredisi: ");
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
