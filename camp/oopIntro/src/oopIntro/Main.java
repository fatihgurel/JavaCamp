package oopIntro;
//Day2-3
public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("MSI");
        product1.setDetail("32 Gb ram");
        product1.setDiscount(15);
        product1.setUnitPrice(24867);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo v15");
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Asus Rog");
        product3.setDetail("8 Gb ram");
        product3.setDiscount(20);
        product3.setUnitPrice(14000);

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product2.getUnitPriceAfterDiscount());
        System.out.println(product3.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Yiyecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("İçecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }

}
