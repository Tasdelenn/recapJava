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

        System.out.println("***********************************");

        KidsGameCalculator kidsGameCalc = new KidsGameCalculator();
        kidsGameCalc.hesapla();
        kidsGameCalc.gameOver();

        //GameCalculator gameCalculator = new GameCalculator(); // Bu şekilde newlenemez !!!
//        GameCalculator gameCalculator = new GameCalculator() {   // new lediğin anda altına metod doldurma otomatik geliyo ama KÖTÜ Bİ KULLANIM...
//            @Override                                            // her new lediğinde içini mi dolduracaksın ?
//            public void hesapla() {   // Abstract base i gizlemek için de yapılabilir. game calculator, metod oluşturmadan new lenemez...
//
//            }
//        };

        GameCalculator gameCalculator = new ManGamCalculator();
        // Abstract sınıf da bi sınıf nihayetinde. Sadece 1 sınıfı inherit edebilir...
        // Kendisini extend eden sınıfın referansını tutabilir...

        System.out.println("***********************************");

        GameCalculator gameCalculator2 = new OlderGameCalculator();
        gameCalculator2.hesapla();

    }
}
