package OOP_2_3_Odev._17_Composition_InnerClass_Static;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        Product product1 = new Product();
        product1.name = "IPhone 13 Pro";
        product1.price = 40000;
        manager.add(product1);

    }
}
