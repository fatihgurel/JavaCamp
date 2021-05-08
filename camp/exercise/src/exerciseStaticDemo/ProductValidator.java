package exerciseStaticDemo;
//Bir methodu static yaptığımızda class ismi ile direk çağırılabilir.

public class ProductValidator {
    static{
        //ProductValidator.isValid(product) bu şekilde çağırıldığında çalışır.
        //Birden fazla static yapısı oluşturulabilir ancak çok yaygın bir kullanım değildir.
        System.out.println("Static Yapıcı Blok Çalıştı");
    }

    public ProductValidator() {
        // new ile çağırıldığı zaman çalışır.
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
