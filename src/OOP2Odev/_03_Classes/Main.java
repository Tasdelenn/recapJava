package OOP2Odev._03_Classes;

public class Main {

    public static void main(String[] args) {

        // Java'da herşey bir nesnedir... Java'da herşey bir class'dır.
        // Class lar referans tiplerdir.
        // Primitive(ilkel) tiplerde değerlerle çalışılır,
        // Referans tiplerde işaret edilen adresler, ve bu adreslerin içeriği ile çalışılır...
        CustomerManager customerManager1 = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        CustomerManager customerManager3 = new CustomerManager();
        CustomerManager customerManager4 = new CustomerManager();

        customerManager1.add();
        customerManager1.remove();
        customerManager1.update();

        //value (primitive types)
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        // num2 = ?
        System.out.println(num2);

        int[] numbers1 = new int[]{1,2,3};  // int[] numbers1 = {1,2,3}; // Böyle de yazabilirsin ama soldaki daha okunabilir...
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;    //Bellekte bir nesne var (HEAP), ama bu aynı nesneyi iki değişken birden tutar oldu...
        numbers1[0] = 109;
        //numbers2[0] = ?
        System.out.println(numbers2[0]);
        //Buradan da anlaşılıyo ki diziler referans tiptir!!!


    }

    /**
    public class CustmerManager{

        //metodlar (operasyonlar) 1
        //metodlar (operasyonlar) 2
        //metodlar (operasyonlar) 3
        //metodlar (operasyonlar) 4
        //...
    }
     */

}
