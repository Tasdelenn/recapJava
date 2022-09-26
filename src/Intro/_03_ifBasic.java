package Intro;

public class _03_ifBasic {

    public static void main(String[] args) {

        // If Else

        int sayi = 50;

        if (sayi < 45) {
            System.out.println("Sayi 45'ten kucuktur.");
        } else if (sayi > 45) {
            System.out.println("Sayi 45'ten buyuktur.");
        } else {
            System.out.println("Sayi 45' esittir.");
        }

        System.out.println("/**************************************************/");

        int vade = 12;
        double dolarDun = 18.25;
        double dolarBugun = 18.45;

        boolean dolarDustuMu = false;

        String okYonu = ""; // default atama

        if (dolarDun < dolarBugun) {
            dolarDustuMu = false;
            okYonu = "up.svg";
            System.out.println("okYonu = " + okYonu);
        } else if (dolarDun > dolarBugun) {
            dolarDustuMu = true;
            okYonu = "down.svg";
            System.out.println("okYonu = " + okYonu);
        } else {
            dolarDustuMu = false;
            okYonu = "equal.svg";
            System.out.println("okYonu = " + okYonu);
        }

        System.out.println("/**************************************************/");

        // Array

        String[] krediler = {"Ev Kredisi", "Araç Kredisi", "İhtiyaç Kredisi", "Emeklilere Özel Kredi"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println("krediler = " + krediler[i]);
        }
    }
}
