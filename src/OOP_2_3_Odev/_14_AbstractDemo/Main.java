package OOP_2_3_Odev._14_AbstractDemo;

public class Main {
    public static void main(String[] args) {
        /**
         * Bir müşterinin veritabanına kaydedilmesi örneğini yapacağız.
         * Bunu mySQL, Oracle, MS SQL, PostGRE SQL... gibi farklı veritabanı programıyla yapabiliriz.
         *
         */

        CustomerManager customerManager = new CustomerManager();
        //customerManager.databaseManager = new SqlServerDatabaseManager(); // mesela müşteri MySQL ile çalışmak istedi:
        customerManager.databaseManager = new MySQLDatabaseMAnager();
        customerManager.getCustomers();

    }
}
