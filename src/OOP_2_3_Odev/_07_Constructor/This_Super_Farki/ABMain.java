package OOP_2_3_Odev._07_Constructor.This_Super_Farki;

public class ABMain {
    public static void main(String[] args) {

        B subObject = new B(1, 2);  // B sınıfından nesne oluştururken constructor ile
        subObject.show();                 // i'ye 1 (a) atandı. Halbuki ilk değeri 10 'du.
    }
}
