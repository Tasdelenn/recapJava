package Intro;

public class _15_miniProject_FindNumber {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 5, 7, 8, 9, 0, 10};
        int searchNum = 8;
        boolean isThere = false;

        for (int num : numbers) {
            if (searchNum == num) {
                System.out.println(" The number found !");
                isThere = true;
                break;
            }
        }
        if(!isThere)
            System.out.println(" Your number is not in the list !");
    }
}
