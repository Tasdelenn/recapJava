package Intro;

public class _13_miniProject_PerfectNumber {

    public static void main(String[] args) {

        // Herbir bölenlerinin toplamı kendine eşit olan sayıya mükemmel sayı denir.
        // 6 >> 1+2+3
        // 28 >> 1+2+4+7+14

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number)
            System.out.println(number + " : This is a perfect number");
        else System.out.println(number + " : This is not a perfect number");
    }
}
