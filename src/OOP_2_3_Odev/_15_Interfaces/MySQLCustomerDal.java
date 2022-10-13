package OOP_2_3_Odev._15_Interfaces;

public class MySQLCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("MySQL Veritabanına Eklendi");

    }
}
