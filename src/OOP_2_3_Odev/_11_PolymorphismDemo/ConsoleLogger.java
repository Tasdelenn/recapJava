package OOP_2_3_Odev._11_PolymorphismDemo;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Console Log İşlemi : " + message);
    }

}
