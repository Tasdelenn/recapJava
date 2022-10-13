package OOP_2_3_Odev._13_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        /**
         * Bir oyun için puan hesaplanmak isteniyo. Oyunda Erkek, Kadın ve Çocuk oyuncular
         * için farklı hesaplama yöntemi kullanılacak...
         */

        // Bunu yaparken, if erkek ise; if kadın ise; if çocuk ise... gibi bir yöntemden
        // uzak duruyoruz. Yoksa kodumuz spagetti koda döner.
        // Sonuçta hepsinde bir hesaplama yöntemi olacağı için aklımıza hemen BaseHesaplama Class'ı gelecek!

        WomanGameCalculator womanGameCalc = new WomanGameCalculator();
        womanGameCalc.hesapla();
        womanGameCalc.gameOver();
    }
}
