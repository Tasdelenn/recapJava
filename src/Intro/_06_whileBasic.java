package Intro;

public class _06_whileBasic {
    public static void main(String[] args) {

        // for
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);
        }
        System.out.println("The for loop is over!");

        // while
        int i=1;
        while (i<10){   // Şart sağlanmazsa döngü başlamaz. Şarttan önce başlatmak için do while kullanılır.
            System.out.println(i);
            i+=2;
        }
        System.out.println("The while loop has  just end!");


        // do while
        int j = 100;
        do {
            System.out.println(j);
        }while (j<10);
        System.out.println("The do while loop has just end!");


    }
}

