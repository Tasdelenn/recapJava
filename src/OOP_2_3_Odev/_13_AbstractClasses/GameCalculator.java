package OOP_2_3_Odev._13_AbstractClasses;

public abstract class GameCalculator {  // Abstract sınıf, abstract method içermek zorunda değil,
                                        // Ama abstract method varsa, sınıf abstract olarak tanımlanmalıdır
    public abstract void hesapla(); // Abstract method bir gövdeye sahip olamaz...
                                    // Sadece bu sınıfı extend eden diğer sınıflar tarafından
                                    // bu methodun içinin doldurulmasını (override edilmesini)
                                    // ZORUNLU KILAR !
    public final void gameOver(){   // Herkes için aynı olduğundan final yaptık
        System.out.println("Oyun Bitti... ");
    }
}
