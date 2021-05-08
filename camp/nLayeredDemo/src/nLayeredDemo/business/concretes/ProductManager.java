package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerServices;

    public ProductManager(ProductDao productDao, LoggerService loggerServices) {
        super();
        this.productDao = productDao;
        this.loggerServices = loggerServices;
    }

    @Override
    public void add(Product product) {
        //iş kodları yazılır
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerServices.logToSystem("Ürün eklendi : " + product.getName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
