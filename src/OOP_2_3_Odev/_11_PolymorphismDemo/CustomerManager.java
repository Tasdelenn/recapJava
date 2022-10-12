package OOP_2_3_Odev._11_PolymorphismDemo;

public class CustomerManager extends BaseLogger {
    public BaseLogger logger; // 1. field oluşturdum.

    public CustomerManager(BaseLogger logger) {     // 2. constructor oluşturdum, new lenirken burası çalışacak.
        this.logger = logger;                       // ve new lenirken bana bi BaseLogger verecek (logger)
    }

    public void add() {     // Diğer logger larda Base 'i extend ettiğine göre artık add metodunu istediğim logger la çalıştırabilirim...

        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");

        // add yapıldığında, hem müşteri eklendi yazacak; hem de hangi sınıfla new leme yapıldıysa, constructor ı çalışacak ve onun log mesajını da yazacak...

    }
}
