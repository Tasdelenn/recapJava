package OOP_2_3_Odev._02_Methods2;

public class Main {

    public static void main(String[] args) {

        String message = "Bugün hava çok güzel";
        String newMessage = message.substring(0,2);
        //String newMessage2 = ekle();   //Bu hata verir çünkü ekle void, String döndürmediği için String bi değişkene atayamayız.
        //String newMessage3 = topla();  //Bu da hata verir çünkü return edilen değer int (9)
        String newMessage4 = sehirVer();
        //int number = topla(3,6);  //Bu da hata verir çünkü topla() fonksiyonumuz parametresiz...
        int toplamNum = toplaParametreli(3,6);
        int toplam = toplaVariable(1,2,3,5,8,13,21,33);

        System.out.println(newMessage);
        System.out.println(sehirVer());

        System.out.println("toplamNum = " + toplamNum);
        System.out.println(toplam);

    }

    //void operasyon örnekleri
    public static void ekle(){
        System.out.println("Eklendi");  //Ekrana bişey yazdırması o fonksiyonun değer ürettiği (return) anlamına gelmez.
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static String sehirVer(){
        return "Manisa";
    }

    public static int topla(){
        return 9;
    }

    //Parametreli Fonksiyon
    public static int toplaParametreli(int formalNum1, int formalNum2){
        return formalNum1+formalNum2;
    }

    //Variable arguments : Fonksiyona birden fazla formal parametre gönderdiğimiz zaman bu variable arguments olur...
    public static int toplaVariable(int... numbers){

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}


