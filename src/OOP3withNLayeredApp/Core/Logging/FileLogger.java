package OOP3withNLayeredApp.Core.Logging;


public class FileLogger implements ILogger {
    @Override   // Annotation, zorunlu değil ama, sınıfın implemente edildiğini,
                // bu methodun aslında base bi sınıftan alındığını ve burada da
                // ilgili metodun üzerine yazıldığını ifade eder...
    public void log(String data) {
        System.out.println("Dosyaya loglandı: " + data);
    }
}
