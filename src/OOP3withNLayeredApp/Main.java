package OOP3withNLayeredApp;

import OOP3withNLayeredApp.Business.ProductManager;
import OOP3withNLayeredApp.DataAccess.HibernateProductDao;
import OOP3withNLayeredApp.DataAccess.IProductDao;
import OOP3withNLayeredApp.DataAccess.JdbcProductDao;
import OOP3withNLayeredApp.Entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        // UI (Arayüzümüz de Main olsun... Yani müşterinin ekrandan girişlerini buradan yaptığını farz edelim.)
        // Şimdilik arada API olmadığını varsayarsak, arayüz (UI) iş birimiyle kontak kurar...

        Product product1 = new Product(1,"Iphone 13Pro",20000); // Normalde müşteri ID girmez de... Öğrenmek için varsayım yapıyoruz...

        ProductManager productManager1 = new ProductManager(new HibernateProductDao());
        ProductManager productManager2 = new ProductManager(new JdbcProductDao());
        productManager1.add(product1);
        productManager2.add(product1);

    }
}
