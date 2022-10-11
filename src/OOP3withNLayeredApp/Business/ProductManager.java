package OOP3withNLayeredApp.Business;

import OOP3withNLayeredApp.DataAccess.HibernateProductDao;
import OOP3withNLayeredApp.DataAccess.JdbcProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class ProductManager {

    public void add(Product product) throws Exception {
        // İş kuralları buraya yazılır.
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 TL 'den küçük olamaz");
        }

        HibernateProductDao productDao = new HibernateProductDao(); // Bu doğru bi yöntem değil. Çünkü bu sefer de Hibernate e bağımlı olduk...
        productDao.add(product);
    }
}
