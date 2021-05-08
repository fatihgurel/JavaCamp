package exerciseClasses;
//main class

public class ReCapDemo1 {

    public static void main(String[] args) {
        ReCapDemo1_1 reCapDemo = new ReCapDemo1_1();
        int toplam = reCapDemo.Topla(5, 5);
        int fark = reCapDemo.Cikar(5, 5);
        int carpim = reCapDemo.Carp(5, 5);
        int bolum = reCapDemo.Bol(5, 5);
        System.out.println("Toplam: " + toplam + " Fark: " + fark +  " Çarpım: " + carpim + " Bölüm: " + bolum);

    }

}
