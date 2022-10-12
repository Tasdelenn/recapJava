package OOP_2_3_Odev._11_PolymorphismDemo;

public class DatabaseLogger extends BaseLogger{
    // Override yapılmaz da, boş bırakılırsa; BaseLogger 'ın default mesajını yazar.
    @Override
    public void Log(String message) {
        System.out.println("Database Log İşlemi : " + message);
    }

}
