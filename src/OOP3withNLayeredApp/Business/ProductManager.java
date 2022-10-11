package OOP3withNLayeredApp.Business;

import OOP3withNLayeredApp.DataAccess.JdbcProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class ProductManager {

    public void add(Product product) throws Exception {
        // İş kuralları buraya yazılır.
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 TL 'den küçük olamaz");
        }

        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
    }
}
