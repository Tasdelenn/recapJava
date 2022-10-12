package OOP3withNLayeredApp.Core.Logging;

public class MailLogger implements ILogger{
    @Override   // Annotation
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);
    }
}
