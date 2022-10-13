package OOP_2_3_Odev._17_Composition_InnerClass_Static;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        Product product1 = new Product();
        product1.name = "IPhone 13 Pro";
        product1.price = 40000;
        manager.add(product1);

        manager.add(product1);

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();   // Static class ları inner class olarak ortak işler için bu şekilde kullanabiliriz...
        /** AMA UYARI : Bu şekilde bi kullanım SOLID prensipleri gereği tavsiye edilmez
         * Bu kullanım bir best practice DEĞİLDİR !
         * Birbirine benzeyen operasyonları evet parçalayın, ama bunu tek bir Database Helper sınıfına koyduğun anda,
         * Single Responsibility (bir class sadece bir işi yapar) prensibine aykırı hareket etmiş olursun.
         * Inner Class lar önceden kullanılıyodu ama günümüzde neredeyse kullanılmıyor. Programcılar daha bilinçli...
         */
    }
}
