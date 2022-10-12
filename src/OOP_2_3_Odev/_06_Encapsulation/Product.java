package OOP_2_3_Odev._06_Encapsulation;

public class Product {

    //attribute veya field :
    private int id; // Biz bunu bi if bloğu içinde tanımlasaydık, sadece o blokta geçerli olurdu (private)
                    // Yani bi üstteki {} bloğunun içinde... Dolayısıyla şu anda kendi sınıfında ...
                    // Product { private int blabla }
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //public getter setter metodları yapmazsan, diğer bloklarda (sınıflarda, package larda) private lere erişemezsin !!!
    //sadece get yaparsan read only yapmış olursun...

    //getter
    public int getId(){
        return id;  // e yukarda id var zaten ne alaka burda dersen, bu id ye burdayken condition lar tanımlayabiliriz.
                    // değiştirebiliriz ... vs. Bu şekilden ibaret düşünme. Bu aynı zamanda bir metod...
    }


    //setter
    public void setId(int id){

        // id = id; //Böyle yaparsan yukarıdakiyle karıştığı için, bu classın üst değişkenini this. önekiyle belirtiriz.
        this.id = id;
        //return olmasına gerek yok (set ya, o yüzden) ama olabilir de...
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

    //mesela kod özel olsun direkt müşterinin tamamını görmesini istemiyoruz mesela...
    public String getKod() {
        return this.name.substring(0,2) + id;
    }

    //mesela kodun hiçbi şekilde değişmesini istemiyosak, aşağıdaki setKod u iptal ederiz...
    //public void setKod(String kod) {
    //    this.kod = kod;
    //}
}
