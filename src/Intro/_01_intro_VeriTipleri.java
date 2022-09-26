package Intro;

public class _01_intro_VeriTipleri {

    public static void main(String[] args) {
        System.out.println("Hello Again!");

        /** Değişken isimleri Java'da camelCase şeklinde yazılır. ÖRN:
         */

        // Bu bir yorum satırı (başına // koyarak sağlanır)

        String metinBasligi = "Aramanızı buradan yapabilirsiniz";
        String ustMetin = "Döviz ve Altın verileri için son güncellenme zamanı: " +
                "20 Eylül 2022 12:09. BIST 100 ve dış piyasa verileri bilgilendirme" +
                " amaçlı gecikmeli olarak yayınlanmaktadır. Değişim yönü, " +
                "bir önceki günün Bankamız kapanış kurları üzerinden hesaplanmaktadır.";
        String ortaMetin = "Filmlerimiz Yayinda!";
        String altMetin = "Copyright © 2022 Türkiye Halk Bankası A.Ş.";
        String altMetindekiIletisimBilgisi = "0850 222 0 400";

        System.out.println("metinBasligi = " + metinBasligi);
        System.out.println("ustMetin = " + ustMetin);
        System.out.println("ortaMetin = " + ortaMetin);
        System.out.println("altMetin = " + altMetin);
        System.out.println("altMetindekiIletisimBilgisi = " + altMetindekiIletisimBilgisi);

        boolean isIt = true;
        System.out.println("OnlyOne bit : " + isIt);
        char karakter1 = 'G';
        char karakter2 = 71;
        System.out.println("letter : " + karakter1 + "  letter ASCII : " + karakter2);
        byte byteA = 128-1;
        System.out.println("1 byte maximum byte = " + byteA);
        short numShort = 32768-1;
        System.out.println("2 byte maximum short = " + numShort);
        int numInt = 2147483647;
        System.out.println("4 byte maximum integer = " + numInt);
        long numLong = 999999999;
        float numFLo = 999999999;
        double numDouble = 999999999;
        double e = 2.7182818284590452354;
        double pi = 3.14159265358979323846;

        //  boolean	1 bit	Stores true or false values
        //  char	2 bytes	Stores a single character/letter or ASCII values
        //  byte	1 byte	Stores whole numbers from -128 to 127
        //  short	2 bytes	Stores whole numbers from -32,768 to 32,767
        //  int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        //  long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //  float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        //  double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits

    }
}
