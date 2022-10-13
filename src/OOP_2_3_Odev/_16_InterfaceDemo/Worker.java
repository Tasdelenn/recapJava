package OOP_2_3_Odev._16_InterfaceDemo;

// Bizim çalışanımız
public class Worker implements IWorker,IEatable,IPayable {
    @Override
    public void work() {
        System.out.println("yazılım departmanı iç personel");
    }

    @Override
    public void eat() {
        System.out.println("passcard yemek kartı yüklendi");
    }

    @Override
    public void pay() {
        System.out.println("Maaş ödemesi yapıldı");
    }
}
