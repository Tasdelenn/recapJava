package OOP_2_3_Odev._11_PolymorphismDemo;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("Console Log İşlemi : " + message);
    }

}
