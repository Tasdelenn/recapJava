package OOP3withNLayeredApp;

import OOP3withNLayeredApp.Business.ProductManager;
import OOP3withNLayeredApp.Core.Logging.DatabaseLogger;
import OOP3withNLayeredApp.Core.Logging.FileLogger;
import OOP3withNLayeredApp.Core.Logging.ILogger;
import OOP3withNLayeredApp.Core.Logging.MailLogger;
import OOP3withNLayeredApp.DataAccess.HibernateProductDao;
import OOP3withNLayeredApp.DataAccess.IProductDao;
import OOP3withNLayeredApp.DataAccess.JdbcProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        // UI (Arayüzümüz de Main olsun... Yani müşterinin ekrandan girişlerini buradan yaptığını farz edelim.)
        // Şimdilik arada API olmadığını varsayarsak, arayüz (UI) iş birimiyle kontak kurar...

        Product product1 = new Product(1,"Iphone 13Pro",20000); // Normalde müşteri ID girmez de... Öğrenmek için varsayım yapıyoruz...

        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};  // İster birini, ister iki veya üçünü gir, istersen hiç girme...

        ProductManager productManager1 = new ProductManager(new HibernateProductDao(),loggers);
        productManager1.add(product1);


    }
}
