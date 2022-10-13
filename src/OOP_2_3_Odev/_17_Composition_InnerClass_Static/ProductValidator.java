package OOP_2_3_Odev._17_Composition_InnerClass_Static;

public class ProductValidator {
    public boolean isValid(Product product){

        if (product.price>0 && !product.name.isEmpty())
            return true;
        else return false;
    }
}
