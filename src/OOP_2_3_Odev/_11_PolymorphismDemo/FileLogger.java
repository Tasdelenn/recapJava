package OOP_2_3_Odev._11_PolymorphismDemo;

public class FileLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("File Loglama İşlemi : " + message);
    }
}
