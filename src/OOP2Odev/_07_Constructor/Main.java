package OOP2Odev._07_Constructor;

public class Main {

    public static void main(String[] args) {

        Product product10 = new Product(10,"Cell Phone", "Çift Hatlı", 6500,13,"mavi");
        System.out.println("***************************************");

        Product product09 = new Product();  // new lendiği anda boş constructor çalışır.
        product09.setName("Laptop");
        product09.setId(9);   // id backend de oluşturulur; diğerleri ui'de (frontend'de)...
        product09.setPrice(5000);
        product09.setStockAmount(86);
        product09.setDescription("Asus 15,6 inch Intel i7 CPU");
        System.out.println("product09.name = " + product09.getName());
        System.out.println("///////////////////////////////////////");

        ProductManager productManagerCheff = new ProductManager();
        productManagerCheff.Add(product09);
        //SOLID >>> DİKKAT! bir class, bir metod, SADECE bir iş yapar...
        System.out.println(product09.getKod());
        System.out.println("---------------------------------------");


    }
}
