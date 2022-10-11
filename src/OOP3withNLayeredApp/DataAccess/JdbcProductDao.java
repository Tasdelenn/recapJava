package OOP3withNLayeredApp.DataAccess;

import OOP3withNLayeredApp.Entities.Product;

public class JdbcProductDao implements IProductDao {    // JdbcProductDao

    public void add(Product product){
        //Sadece ve sadece DB erişim kodları yazılır buraya (Çünkü Data Access kısmındayız) >> SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
    // Mesela ürünlere bi telefon eklemek istiyoruz. Ama mesela bu ürün duplicate olmamalı.
    // O yüzden buna ilişkin bi kuralımız olacak. Ama yeri burası değil.
    // Sonuçta kurallar işe ilişkin, ürüne özgü değil.
    //O yüzden kuralları Business kısmında tanımlayacağız.
}
