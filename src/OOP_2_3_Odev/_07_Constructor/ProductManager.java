package OOP_2_3_Odev._07_Constructor;

public class ProductManager {

    public void Add(Product formalProduct){

        // Normalde JDBC (Java Database Connectivity) kulanarak , bu bilgileri DATABASE den çekicez/yazıcaz...
        System.out.println(formalProduct.getName() + " Ürün Eklendi");

    }

}
