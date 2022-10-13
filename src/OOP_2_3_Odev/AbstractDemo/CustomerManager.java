package OOP_2_3_Odev.AbstractDemo;

public class CustomerManager {

    public void getCustomer(){  // Müşterileri getir diye bir operasyon yazıyorum.
                                // Sonuçta bunun için ya Oracle ya da SQL Server 'ı kullanıcam.
                                // Şayet Oracle ya da SQL Server nesnesini burada oluşturduğumuz an o nesneye bağımlı hale geliriz...
                                // Bunu bağımlı olmadan yapmaya çalışıcaz.

        /** Yanlış Kullanım: */
        OracleDatabaseManager oracleDatabaseManager1 = new OracleDatabaseManager();
        oracleDatabaseManager1.getData();
        /** ORACLE a bağımlı hale gelmiş oluruz... */
    }
}
