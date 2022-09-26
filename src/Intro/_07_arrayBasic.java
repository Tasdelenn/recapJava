package Intro;

public class _07_arrayBasic {
    public static void main(String[] args) {

        String student1 = "Ali";
        String student2 = "Veli";
        String student3 = "Hasan";
        String student4 = "Hüseyin";
        String student5 = "Ayşe";
        String student6 = "Fatma";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);

        System.out.println("******************************");

        String[] students = new String[6];
        students[0] = "Ali";
        students[1] = "Veli";
        students[2] = "Hasan";
        students[3] = "Hüseyin";
        students[4] = "Ayşe";
        students[5] = "Fatma";
       // students[6] = "Emine";  // out of bound

        for (int i =0; i< students.length ; i++)
        {
            System.out.println(students[i]);
        }

        System.out.println("**********************");

        // foreach
        for (String stu : students) {
            System.out.println(stu);
        }



    }
}
