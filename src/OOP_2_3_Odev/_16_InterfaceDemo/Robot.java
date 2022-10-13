package OOP_2_3_Odev._16_InterfaceDemo;

public class Robot implements IWorker,IMaintenance{
    @Override
    public void work() {
        System.out.println("teknik servis robotik işler");
    }

    @Override
    public void maintanence() {
        System.out.println("periyodik bakım zamanı geldi.");
    }
}
