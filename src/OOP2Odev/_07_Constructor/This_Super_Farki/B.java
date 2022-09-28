package OOP2Odev._07_Constructor.This_Super_Farki;

class B extends A {

    int i;       // i değişkeni B nin bir iç öğesi olduğundan,
                 // B alt-sınıfı A ‘nın i öğesini doğrudan göremez.

    B(int a, int b) {
        super.i = a;      //  A içindeki i
        this.i = b;       //  B içindeki i
    }

    void show() {
        System.out.println("i nin A ust-sınıfındaki degeri : " + super.i);
        System.out.println("i nin B alt-sınıfındaki degeri : " + this.i);
    }
}
