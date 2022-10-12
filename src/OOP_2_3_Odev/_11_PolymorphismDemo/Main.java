package OOP_2_3_Odev._11_PolymorphismDemo;

public class Main {
    public static void main(String[] args) {

        EmailLogger logger = new EmailLogger();
        logger.Log("Log mesajı");

        DatabaseLogger logger2 = new DatabaseLogger();
        logger2.Log("Log mesajı 2");

        System.out.println("*******************************");

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new ConsoleLogger(), new FileLogger()}; // injection
        // BaseLogger kendisini extend eden sınıfların referansını tutabilir (Polimorfizm)
        // FileLogger, DatabaseLogger, EmailLogger "BaseLogger" ı tutamaz ama, BaseLogger hepsini tutabilir.
        // Bu şekilde loggers' a istediğimizi enjekte edebilir; istediğimizi silebliriz. Kod bloğunun geri kalanı etkilenmez.
        // Mesela EmailLogger 'ı sildik; ConsoleLogger 'ı ekledik (Injection)... Kod blaoğunun kalan kısmı değişmedi...

        for (BaseLogger log : loggers){
            log.Log("Log mesajı");
        }


    }
}
