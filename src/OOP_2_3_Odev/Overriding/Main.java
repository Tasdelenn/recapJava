package OOP_2_3_Odev.Overriding;

public class Main {
    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new OgretmenCreditManager(),new TarimCreditManager()};
        //Ogretmen ve Tarım kredi ikisi de Base class'ı extend ettiği için BaseClass nesnesi,
        //ikisinin de referansını tutabiliyo, hatta aynı dizinin içine yazbiliyoruz...

        for (BaseCreditManager kredi: creditManagers) {
            System.out.println("kredi = " + kredi.hesapla(2000));
        }
        //Şu anda ikisi için de aynı tutarı hesapladı.... Ama mesela banka diyelim ki,
        //farklı oranlarla yeni bi öğrenci kredisi vermek istedi... Bunu nasıl yapacağız?

    }
}
