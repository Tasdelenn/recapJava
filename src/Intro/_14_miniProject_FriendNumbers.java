package Intro;

public class _14_miniProject_FriendNumbers {
    public static void main(String[] args) {

        // Kendileri hariç, pozitif tam bölenleri toplamı
        // diğer beher sayıya eşit olan iki sayıya arkadaş sayı denir.

        int num1 = 220;
        int num2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < num1; i++)  // Birinci sayının PBS toplamı
        {
            if (num1 % i == 0) {
                total1 = total1 + i;
            }
        }

        for (int i = 1; i < num2; i++) // İkinci sayının PBS toplamı
        {
            if (num2 % i == 0) {
                total2 = total2 + i;
            }
        }

        if (num1 == total2 && num2 == total1) {
            System.out.println(num1 + " and " + num2 + " are friends numbers");
        } else
            System.out.println(num1 + " and " + num2 + " are not friends numbers");

    }
}
