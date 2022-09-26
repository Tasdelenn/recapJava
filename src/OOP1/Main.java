package OOP1;

public class Main {

    public static void main(String[] args) {

        /**
        web üzerinde işlem yapacaksak, mesela
        hepsiburda.com gibi bi sitede gelen response
        aşağıdaki gibi olur...
         */

        String message = "Vade Orani";
            //set value

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("blabla1.jpg");

            //get
        //System.out.println("name : " + product1.name);
        //System.out.println("price : " + product1.unitPrice);

        Product product2 = new Product();
        product2.setName("Arçelik 3190 Telve");
        product2.setUnitPrice(5000);
        product2.setDiscount(4);
        product2.setUnitInStock(6);
        product2.setImageUrl("blabla2.jpg");

        Product product3 = new Product();
        product3.setName("Arzum OK0013 Kahveci");
        product3.setUnitPrice(2000);
        product3.setDiscount(10);
        product3.setUnitInStock(5);
        product3.setImageUrl("blabla3.jpg");

        Product product4 = new Product();
        product4.setName("Karaca Hatır Türk Kahvesi");
        product4.setUnitPrice(3999);
        product4.setDiscount(5);
        product4.setUnitInStock(8);
        product4.setImageUrl("blabla4.jpg");


        Product[] products = {product1,product2,product3,product4};

        System.out.println("<ul>");
        for (Product prod : products){
            System.out.println("<li>" + prod.getName() + "</li>");
        }
        System.out.println("</ul>");

        /******************************************************/

        IndividualCustomer individualCustomer1 = new IndividualCustomer();   //Bireysel Müşteri nesnesi oluşturduk
        individualCustomer1.setId(1);
        individualCustomer1.setPhone("5553343434");
        individualCustomer1.setCustomerNumber("3099090");
        individualCustomer1.setFirstName("Hakan");  //IndividulaCustomer'da private ad soyad tanımlayınca set yapabilir hale geldik.
        individualCustomer1.setLastName("Tasdelem");

        CorporateCustomer corporateCustomer1 = new CorporateCustomer();
        corporateCustomer1.setId(100);
        corporateCustomer1.setPhone("2122224466");
        corporateCustomer1.setCustomerNumber("1110000");
        corporateCustomer1.setCompanyName("kodlama.io");
        corporateCustomer1.setTaskNumber("8887776661");

        Customer[] customers = {individualCustomer1, corporateCustomer1};




        
    }

}
