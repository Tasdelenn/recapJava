package OOP_2_3_Odev._15_Interfaces;

public class AmazonCloudDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("AWS ye eklendi.");
    }
}
