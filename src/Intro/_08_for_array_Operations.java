package Intro;

public class _08_for_array_Operations {
    public static void main(String[] args) {

        double [] myList = {100.55,1.2,1.3,4.8,5.7,8.99};
        double total = 0;
        double max = myList[0];

        for (double number : myList){

            if (number>max){
                max = number;
            }

            total = total + number;
            System.out.println(number);
        }

        System.out.println("max = " + max);
        System.out.println("total = " + total);
    }
}
