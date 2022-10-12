package OOP_2_3_Odev._08_Overloading;

public class Address {

    public String konumGir(String Ulke){
        return Ulke;
    }

    public String konumGir(String Ulke, String Bolge){
        return Ulke+" "+Bolge;
    }

    public String konumGir(String Ulke, String Bolge, String Sehir){
        return Ulke+" "+Bolge+" "+Sehir;
    }

    public String konumGir(String Ulke, String Bolge, String Sehir, String Ilce){
        return Ulke+" "+Bolge+" "+Sehir+" "+Ilce;
    }


}
