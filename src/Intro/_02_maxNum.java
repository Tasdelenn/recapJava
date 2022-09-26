package Intro;

public class _02_maxNum {

    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 29;
        int num3 = 37;

        int maxNum = num1;
        if (maxNum < num2) {
            maxNum = num2;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }
        System.out.println("maxNum = " + maxNum);
    }
}
