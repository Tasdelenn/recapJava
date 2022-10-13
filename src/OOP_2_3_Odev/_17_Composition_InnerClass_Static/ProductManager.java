package OOP_2_3_Odev._17_Composition_InnerClass_Static;

public class ProductManager {
    public void add(Product product){   // add() operasyonuyla, ürün veritabanına eklensin.

        if (ProductValidator.isValid(product))
        System.out.println("Veritabanına Eklendi.");
        else System.out.println("Ürün bilgisi geçersizdir.");
    }

    // fooBar() 'ın gelebilmesi için, ProductValidator'un new lenmesi lazım
    ProductValidator productValidator = new ProductValidator();
}
