package OOP_2_3_Odev._11_PolymorphismDemo;

public class EmailLogger extends BaseLogger{
    //@Override
    public void log(String message){
        System.out.println("Email gönderildi : " + message);
    }
}
