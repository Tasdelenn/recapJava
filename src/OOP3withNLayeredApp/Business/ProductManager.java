package OOP3withNLayeredApp.Business;

import OOP3withNLayeredApp.Core.Logging.ILogger;
import OOP3withNLayeredApp.DataAccess.IProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class ProductManager {
    private IProductDao productDao;
    //private List<Logger> loggers; // collection
    private ILogger[] loggers;   // array

    public ProductManager(IProductDao productDao,ILogger[] loggers)     // Yani "bana bir tane logger yollama bisürü logger yolla. >> POLYMORPHISM !!!
    { // ProductManager new lendiğinde bana bir productDao ver.
        this.productDao = productDao;
        this.loggers = loggers; // this. demek, bu sınıf demek. Bu class'ın içindeki logger, gönderilen (parametrik) loggerlar dır.
                                // this. yoksa, kendine en yakın logger a bakar.
    }

    public void add(Product product) throws Exception {
        // İş kuralları buraya yazılır.
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 TL 'den küçük olamaz");
        }

        productDao.add(product);

        for (ILogger logger : loggers) {    //[db, mail, ... ] Polymorphism >> hangi logger istenirse istensin, dinamik olarak logger arayüzünden erişilebilir.
            logger.log(product.getName());
        }
    }
}
