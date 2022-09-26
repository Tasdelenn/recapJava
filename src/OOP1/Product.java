package OOP1;

//PascalCase (Sınıf İsimleri)
public class Product {

    private String name;
    private double unitPrice;
    private double discount;
    private double unitInStock; //camelCase (Değişken İsimleri)
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(double unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
