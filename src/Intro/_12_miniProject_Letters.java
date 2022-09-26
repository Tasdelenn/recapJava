package Intro;

public class _12_miniProject_Letters {

    public static void main(String[] args) {

        char letter='G';
        switch (letter)
        {
            case 'A':
            case 'O':
            case 'U':
            case 'I':
                System.out.println("Kalın sesli bir harf");
                break;  // break koymazsan aşağıdaki case lerden devam eder...
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli bir harf");
                break;
            default:
                System.out.println("Geçersiz harf");
        }
    }
}
