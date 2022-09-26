package Intro;

public class _11_miniProject_PrimeNum {
    public static void main(String[] args) {

        int number = 457;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {  // Uygulamadaki mantıksal veya sistemsel hatalara bug denir. Bunu koymazsak 1 i asal kabul eder.
            System.out.println("The number is not prime");
            return; // Sayı 1 ise bağlı olduğu metodu (ki burada main) peşin peşin bitirip çıkar
        }

        if (number < 1) {   // Bu şekilde kullanıcının doğru verileri girmesini sağlamaya defensive programming (korumacı program) deniyo.
            System.out.println("Invalid  Number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("The number is prime");
        else System.out.println("The number is not prime");


    }
}
