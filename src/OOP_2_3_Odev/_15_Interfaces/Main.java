package OOP_2_3_Odev._15_Interfaces;

import OOP_2_3_Odev._14_AbstractDemo.MySQLDatabaseMAnager;

public class Main {
    public static void main(String[] args) {
        /**
         * İş katmanı (CustomerManager) MySQL veya Oracle'ı kullansın...
         */
        CustomerManager customerManager = new CustomerManager(new MySQLCustomerDal());    // Burada interface lerle polimorfizm i yapmış olduk...
        customerManager.add();
    }
}
