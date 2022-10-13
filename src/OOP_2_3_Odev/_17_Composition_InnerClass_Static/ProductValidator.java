package OOP_2_3_Odev._17_Composition_InnerClass_Static;

public class ProductValidator { // Java da ana class static olamaz, ama bunun içinde oluşturduğumuz başka bi class staticolabilir
                                // Buna inner class diyoruz ve genelde programcı bu yapıyı gruplamak için kullanır.

    static {    // Nesne new lenmeden çalışmasını istiyosak, bu şekilde yazabiliriz.
        System.out.println("Statik Yapıcı Blok Çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");  // Yapıcı blok ProductValidator new lendiği anda çalışır...
    }

    public static boolean isValid(Product product){

        if (product.price>0 && !product.name.isEmpty())
            return true;
        else return false;
    }

    public void fooBar(){   // Static değilken bunu çağırabilmem için ProductValidator'ü new lemem lazım.

    }

    public static class classIcindeBaskaBirClass{   // Bu tarz class lara inner class deniyo.
        public static void sil(){

        }
    }


}
