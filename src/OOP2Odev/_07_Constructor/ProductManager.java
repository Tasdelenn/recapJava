package OOP2Odev._07_Constructor;

public class ProductManager {

    public void Add(Product formalProduct){

        // Normalde JDBC (Java Database Connectivity) kulanarak , bu bilgileri DATABASE den çekicez/yazıcaz...
        System.out.println(formalProduct.getName() + " Ürün Eklendi");

    }

}
