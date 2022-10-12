package OOP_2_3_Odev._08_Overloading;

public class ToplamaIslemi {

    public int topla(int num1, int num2){
        return num1+num2;
    }

    public int topla(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public int topla(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

    public String topla(int num1, int num2, int num3, String formalStr){ // Bu şekilde henüz çalıştıramadım.
        int topla = num1+num2+num3;
        return (String.valueOf(topla) + " " + formalStr);
    }

}
