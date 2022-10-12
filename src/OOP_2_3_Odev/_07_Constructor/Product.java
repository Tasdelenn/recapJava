package OOP_2_3_Odev._07_Constructor;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk){
        // Product new lenirken yukarıdaki değerleri girmeye zorlayacak...
        // Constructor ın, kendisinin içinde yer aldığı sınıfla aynı isimde bir metod gibi olduğuna dikkat ET!!!
        System.out.println("Parametreli Constructor oluşturuldu...");
    }

    public Product(){
        // Normalde her class ta bu şekilde boş bi constructor default olarak vardır.
        // new lediğin anda bu metod çalışır...
        // Ama yukarıdaki gibi parametreli consturctor tanımlarsan, default iptal olur.
        // Dolayısıyla, "Product product09 = new Product();" gibi parametresiz bi oluşturma yapacağın zaman bu boş constructor ı tekrar oluşturman lazım...
        System.out.println("Boş constructor...");
    }

    // Aynı isimde, farklı parametrelerle constructor oluşturma işine OVERLOADING denir.!!!

    //attribute veya field :
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 2) + id;
    }


}
