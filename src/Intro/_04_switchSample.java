package Intro;

public class _04_switchSample {

    public static void main(String[] args) {


        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Perfect = " + grade);
                break;
            case 'B':
                System.out.println("Good = " + grade);
                break;
            case 'C':
                System.out.println("It may been better = " + grade);
                break;
            case 'D':
                System.out.println("Bad = " + grade);
                break;
            case 'E':
            case 'F':
                System.out.println("The Worst = " + grade);
                break;
            default:
                System.out.println("Invalid Grade !");
        }
    }
}
