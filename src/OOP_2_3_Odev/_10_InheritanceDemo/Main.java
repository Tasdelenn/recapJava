package OOP_2_3_Odev._10_InheritanceDemo;

 public class Main {

    public static void main(String[] args) {

        TarimKrediManager tarimKrediManager8 = new TarimKrediManager();
        tarimKrediManager8.Hesapla();

        OgretmenKrediManager ogretmenKrediManager5 = new OgretmenKrediManager();
        ogretmenKrediManager5.Hesapla();
        OgretmenKrediManager ogretmenKrediManager6 = new OgretmenKrediManager();

        BaseCreditManager baseCreditManager1 = new BaseCreditManager();
        baseCreditManager1.Hesapla();

        //ogretmenKrediManager5 = (OgretmenKrediManager) baseCreditManager1;  //Sen aslında öğretmen kredisisin... Diyoruz.

        // TarimKrediManager class ında da,
        // OgretmenKrediManager class ında da Hesapla() fonksiyonu olmadığı halde
        // Hesapla() fonksiyonu tarim ve ogretmen için de çalışıyo...
        // Çünkü ikisi de BaseCreditManager'ı extends etti...
        // BUNA POLİMORFİZM DİYORUZ...

        // Peki ogretmen kredi manager ı bir arayüzden nasıl çağırırız? Bunun için CreditUI sınıfı oluşturduk:

        System.out.println("***************************");

        CreditUI creditUIwebSite = new CreditUI();
        creditUIwebSite.krediHesapla(ogretmenKrediManager6);
        creditUIwebSite.krediHesapla(tarimKrediManager8);

        //Tam bu noktada asker, polis, doktor kredisi oluşturmak istiyoruz
        //Yapmamız gereken bu dallara ilişkin sınıflar oluşturacağız, ve BaseCreditManager 'ı extends edicez.
        //Nesnemizi oluşturduktan sonra da, creditUIWebSite arayüzünde kredi hesapla fonksiyonunu kullanabiliriz.

        System.out.println("*********************************");

        _AskerKrediManager askerKrediManager15 = new _AskerKrediManager();
        _DoktorKrediManager doktorKrediManager24 = new _DoktorKrediManager();
        _PolisKrediManager polisKrediManager38 = new _PolisKrediManager();

        creditUIwebSite.krediHesapla(askerKrediManager15);
        creditUIwebSite.krediHesapla(doktorKrediManager24);
        creditUIwebSite.krediHesapla(polisKrediManager38);

    }
}
