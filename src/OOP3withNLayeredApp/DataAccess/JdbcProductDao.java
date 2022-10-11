package OOP3withNLayeredApp.DataAccess;

import OOP3withNLayeredApp.Entities.Product;

public class JdbcProductDao {
    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
