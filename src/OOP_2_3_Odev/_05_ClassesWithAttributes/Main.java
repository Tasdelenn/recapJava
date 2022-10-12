package OOP_2_3_Odev._05_ClassesWithAttributes;

public class Main {

    public static void main(String[] args) {

        Product product09 = new Product();
        product09.name = "Laptop";
        product09.id = 9;   // id backend de oluşturulur; diğerleri ui'de (frontend'de)...
        product09.price = 5000;
        product09.stockAmount = 86;
        product09.description = "Asus 15,6 inch Intel i7 CPU";
        System.out.println("product09.name = " + product09.name);

        Product formalProduct = new Product();
        formalProduct.name = "DesktopPC";
        formalProduct.id = 34;
        formalProduct.price = 10500;
        formalProduct.stockAmount = 12;
        formalProduct.description = "DELL 32 inch Intel i7 CPU";

        //Ürün ekleme işini başka bi class yapıyo... (Product Manager)
        ProductManager productManagerCheff = new ProductManager();
        productManagerCheff.Add(formalProduct);
        //Bir Class'ın içinde başka class ların özelliklerini (attributes | field) kullanabiliriz...
        //Class lar ilgili özellikleri/operasyonları/metodları/attributes ları/field ları TUTARLAR:::
        //Class lar ya özellik (attributes, fields ...) tutar; Ya da operasyon (metod, fonksiyon ...) tutar
        //SOLID >>> DİKKAT! bir class, bir metod, SADECE bir iş yapar...

    }
}
