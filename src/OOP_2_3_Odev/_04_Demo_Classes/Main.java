package OOP_2_3_Odev._04_Demo_Classes;

public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem1 = new DortIslem();
        int sonucTopla = dortIslem1.sum(9,8);
        int sonucCikar = dortIslem1.minus(90,80);
        int sonucCarp = dortIslem1.multiply(4,7);
        double sonucBol = dortIslem1.devide(22,7);

        System.out.println(" toplam: " +sonucTopla + " fark: " + sonucCikar
                + " carpim: " + sonucCarp + " bolum: " + sonucBol);
    }
}
