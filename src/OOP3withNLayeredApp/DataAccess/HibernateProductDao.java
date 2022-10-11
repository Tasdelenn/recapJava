package OOP3withNLayeredApp.DataAccess;

import OOP3withNLayeredApp.Entities.Product;

public class HibernateProductDao {

    public void add(Product product){
        //Sadece ve sadece DB erişim kodları yazılır buraya (Çünkü Data Access kısmındayız) >> SQL
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
