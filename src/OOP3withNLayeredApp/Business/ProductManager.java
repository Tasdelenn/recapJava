package OOP3withNLayeredApp.Business;

import OOP3withNLayeredApp.DataAccess.HibernateProductDao;
import OOP3withNLayeredApp.DataAccess.IProductDao;
import OOP3withNLayeredApp.DataAccess.JdbcProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class ProductManager {


    public void add(Product product) throws Exception {
        // İş kuralları buraya yazılır.
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 TL 'den küçük olamaz");
        }

        IProductDao productDao = new JdbcProductDao(); // IProductDao, HibernateDao nun da JdbcDao nun da referansını tutabiliyo... Ama hala sıkıntı var. Sonuçta burada (=binlerce yerde) new ledik...
        productDao.add(product);
    }
}
