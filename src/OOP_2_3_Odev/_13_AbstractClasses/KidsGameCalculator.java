package OOP_2_3_Odev._13_AbstractClasses;

public class KidsGameCalculator extends GameCalculator{

    @Override
    public void hesapla() { // Normalde burası yoktu, abstract sınıf ve metod olşturulunca,
                            // hesapla() yönteminin kids sınıfı tarafından kullanılması zorunlu kılındı.
                            // Kids de hesapla() metodunu implemente etmiş olduk.
        System.out.println("Puanınız = 200");

    }
}
