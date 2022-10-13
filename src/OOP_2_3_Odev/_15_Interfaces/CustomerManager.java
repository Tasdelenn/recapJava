package OOP_2_3_Odev._15_Interfaces;

public class CustomerManager {
    private ICustomerDal customerDal; // private yaparak customerDal'a dışarıdan erişimi engelledik.
    public CustomerManager(ICustomerDal customerDal){   // Burada, CustomerManager'in constructor 'ında ben bir tane
        this.customerDal = customerDal;                 // ICustomerDal istiyorum. Ve bu ya Oracle, ya MySQL, ya da AmazonCloud olacak...
    }                                                   //
    public void add(){
        // iş kodları / şartları buraya yazılır.
        customerDal.add();

    }
}
