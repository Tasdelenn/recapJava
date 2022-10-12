package OOP_2_3_Odev._01_Methods1;

public class Methods {

    public static void main(String[] args) {

        findItFunction();

    }

    //camelCase
    public static void findItFunction() {

        int[] numbers = new int[]{1, 2, 3, 5, 7, 8, 9, 0, 10};
        int searchNum = 7;
        boolean isThere = false;

        for (int num : numbers) {
            if (searchNum == num) {
                isThere = true;
                break;
            }
        }

        System.out.print(searchNum);
        messages(isThere);

    }

    public static void messages(boolean formalIsThere){

        if (formalIsThere)
            System.out.println(" (The number found !) ");
        else
            System.out.println(" (Your number is not in the list !) ");
    }

}


