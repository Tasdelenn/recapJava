package OOP_2_3_Odev.Overriding;

public class OgrenciKrediManager extends BaseCreditManager {
    public double hesapla(double tutar) {
        // Burada Base'in hesapla() metodunu, öğrenci için ezdik (override ettik).
        // Eğer operasyonum herkes için aynıdır, başkası değiştirmesi dersen:
        // O zaman bir metodu final keyword üyle işaretlemeliyiz, o metod değiştirilemez...
        // private olmaz, çünkü private sadece kendi bloğunda çalışır.
        // final olarak yazılan metodlar, başkası tarafından ezilemez (üzerine override edilemez)
        System.out.println("ogrenci tutar hesaplandı ");
        return tutar * 1.05;

    }
}
