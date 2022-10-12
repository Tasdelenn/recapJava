package OOP_2_3_Odev._06_Encapsulation;

public class Main {

    public static void main(String[] args) {

        Product product09 = new Product();
        product09.setName("Laptop");
        product09.setId(9);   // id backend de oluşturulur; diğerleri ui'de (frontend'de)...
        product09.setPrice(5000);
        product09.setStockAmount(86);
        product09.setDescription("Asus 15,6 inch Intel i7 CPU");
        System.out.println("product09.name = " + product09.getName());

        Product formalProduct = new Product();
        formalProduct.setName("DesktopPC");
        formalProduct.setId(34);
        formalProduct.setPrice(10500);
        formalProduct.setStockAmount(12);
        formalProduct.setDescription("DELL 32 inch Intel i7 CPU");

        //Ürün ekleme işini başka bi class yapıyo... (Product Manager)
        ProductManager productManagerCheff = new ProductManager();
        productManagerCheff.Add(formalProduct);
        //Bir Class'ın içinde başka class ların özelliklerini (attributes | field) kullanabiliriz...
        //Class lar ilgili özellikleri/operasyonları/metodları/attributes ları/field ları TUTARLAR:::
        //SOLID >>> DİKKAT! bir class, bir metod, SADECE bir iş yapar...

        System.out.println(product09.getKod());
        System.out.println(formalProduct.getKod());



    }
}
