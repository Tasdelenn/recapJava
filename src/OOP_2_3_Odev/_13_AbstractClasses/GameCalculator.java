package OOP_2_3_Odev._13_AbstractClasses;

public class GameCalculator {
    public void hesapla(){
        // Burada hesaplama algoritmasına girmiyoruz, sadece mekanizmayı anlamaya çalışıyoruz.
        System.out.println("Puanınız hesaplandı = 100" );
    }

    public void gameOver(){
        // Hesapla kadın, çocuk ve erkek için farklı olabilir ama, gameOver metodu herkes için ortak olsun...
        System.out.println("Oyun Bitti... ");
    }
}
