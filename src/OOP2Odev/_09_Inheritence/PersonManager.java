package OOP2Odev._09_Inheritence;

public class PersonManager {

    public void List() {
        // Normalde bu, JDBC vasıtasıyla veritabanından çekilir veya oraya yazılır,
        // o yüzden void olmaz. Sadece örnek vermek için metodun işlediğine dair
        //aşağıdaki gibi bi çıktı almak istedik...
        System.out.println("Listelendi.");
    }

    public void Add() {
        System.out.println("Eklendi.");
    }

    public void Remove() {
        System.out.println("Kayıt silindi.");
    }
}
