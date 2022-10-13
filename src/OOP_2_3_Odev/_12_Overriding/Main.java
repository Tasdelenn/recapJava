package OOP_2_3_Odev._12_Overriding;

public class Main {
    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new OgretmenCreditManager(),new TarimCreditManager(),new OgrenciKrediManager()};
        //Ogretmen ve Tarım kredi ikisi de Base class'ı extend ettiği için BaseClass nesnesi,
        //ikisinin de referansını tutabiliyo, hatta aynı dizinin içine yazabiliyoruz...
        //NOT: Ogrenci kredisini Base ' e extend etmezsen farklı oranla hesapla metodunu yazabilirsin ama bu sefer dizinin içindeki ogrenci kredi nesnesi patlar...!

        for (BaseCreditManager kredi: creditManagers) {
            System.out.println("kredi = " + kredi.hesapla(2000));
        }
        //Şu anda ikisi için de aynı tutarı hesapladı.... Ama mesela banka diyelim ki,
        //farklı oranlarla yeni bi öğrenci kredisi vermek istedi... Bunu nasıl yapacağız?
        //1.class'ı tanımla > 2.Base'e extend et > 3.Kendi metodunu Base üzerine override et. >4.Nesnesini oluştur ve kullan

    }
}
