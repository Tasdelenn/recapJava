package OOP_2_3_Odev._15_Interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle veritabanına eklendi.");
    }
}
