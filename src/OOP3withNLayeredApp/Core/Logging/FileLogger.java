package OOP3withNLayeredApp.Core.Logging;


public class FileLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı: " + data);
    }
}
