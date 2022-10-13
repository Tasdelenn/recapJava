package OOP_2_3_Odev._14_AbstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;   // Bizim stratejik nesnemiz. Çünkü ister Oracle'ı ister SQL Server'i
                                           // İstersek de sonradan oluşturabileceğimiz mesela bir MySQL nesnesinin
                                           // REFERANSLARINI TUTABİLİR
    public void getCustomers(){ // Müşterilerileri getir diye bir operasyon yazıyorum.
                                // Sonuçta bunun için ya Oracle ya da SQL Server 'ı kullanıcam.
                                // Şayet Oracle ya da SQL Server nesnesini burada oluşturduğumuz an o nesneye bağımlı hale geliriz...
                                // Bunu bağımlı olmadan yapmaya çalışıcaz.

        databaseManager.getData();  // DOĞRU KULLANIM

    }
}
