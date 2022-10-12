package OOP_2_3_Odev._10_InheritanceDemo;

public class CreditUI {

    // public void krediHesapla(OgretmenKrediManager ogretmenKrediManagerFormal){
    // ogretmenKrediManagerFormal.Hesapla();
    // }
    //Bunu böyle yaparsak, Öğretmen için ayrı,
    //tarım kredi için ayrı, yarın bigün doktor, polis, asker kredisi eklemek gerekirse işler daha da karışacak...
    //O yüzden bu şekilde yapmayacağız... Aşağıdaki gibi yapacağız:


    public void krediHesapla(BaseCreditManager baseCreditManagerFormal){
        baseCreditManagerFormal.Hesapla();
        // BaseCreditManager hem ogretmen, hem tarım kredi, hem daha sonra base den extends edilecek sınıflar için uygulanabilecek.
        // O yüzden yuarıdaki gibi kullanmayacağız...

        // if li switch li spagettiden uzak dur! Kötü programda sadece bir tane krediManager olur, if söyleyse şunu yap,
        // böyleyse bunu yap... şeklinde veya switchlerle karmaşık hale gelir...
    }
}
