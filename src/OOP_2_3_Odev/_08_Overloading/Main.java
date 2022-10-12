package OOP_2_3_Odev._08_Overloading;

public class Main {

    public static void main(String[] args) {

        ToplamaIslemi toplaFunc = new ToplamaIslemi();
        System.out.println("İki parametreli topla : " + toplaFunc.topla(13,17));
        System.out.println("Üç parametreli topla : " + toplaFunc.topla(13,17,29));
        System.out.println("Dört parametreli topla : " + toplaFunc.topla(13,17,29,37));

        //Bu şekilde ToplamaIslemi class ında aynı metodu (topla),
        //aynı isimle, ama farklı parametrelerle çalıştırabildiğimiz
        //durumlara overloading denir...
        //Yani "topla" metodu, aşırı yüklenmiş oldu...

        System.out.println("**********************************");

        Address konumum = new Address();
        String ulkeM = konumum.konumGir("Turkiye");
        String bolgeM = konumum.konumGir("Turkiye","Ege Bolgesi");
        String sehriM = konumum.konumGir("Turkiye","Ege Bolgesi","Manisa");
        String kasabaM = konumum.konumGir("Turkiye","Ege Bolgesi","Manisa","Turgutlu");
        System.out.println(sehriM);
        //Şeklinde, hangi kullanım bize uyuyorsa seçebiliriz...

    }
}
