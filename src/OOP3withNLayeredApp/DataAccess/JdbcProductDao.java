package OOP3withNLayeredApp.DataAccess;

import OOP3withNLayeredApp.Entities.Product;

public class JdbcProductDao {
    public void add(Product product){
        //SAdece ve sadece DB erişim kodları yazılır buraya (Çünkü Data Access kısmındayız) >> SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
