package OOP3withNLayeredApp.Core.Logging;

public class DatabaseLogger implements ILogger{
    @Override   // Annotation
    public void log(String data) {
        System.out.println("Veritabanına loglandı: " + data);
    }
}
