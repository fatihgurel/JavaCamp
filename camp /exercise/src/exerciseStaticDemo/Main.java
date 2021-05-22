package exerciseStaticDemo;
 
public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        manager.add(product);
        
        System.out.println("--------------------");
        
        //Bu tarz bir kullanım vardır ama çok yaygın değildir.
        //Bir class sadece bir iş yapar!!! <Single-responsibility principle>
        DatabaseHelper.Crud.Update();
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnetion();
    }
}
