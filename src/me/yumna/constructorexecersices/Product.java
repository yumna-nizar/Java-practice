package me.yumna.constructorexecersices;

public class Product {
    String productName;
    String productID;
    double price;
    double discount;

    Product()
    {
        this("unknown","unknown",0.0,0.0);
    }
    Product(String productName,String productID)
    {
        this(productName,productID,0.0,0.0);
    } Product( String productName,String productID,double price,double discount)
    {
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.discount=discount;
    }
    double CalculateDiscountPrice()
    {
        double discountprice=(100-discount)/100*price;
         return discountprice;

    }
    void displaydetails()
    {
        System.out.println("product name:"+productName);
        System.out.println("product id:"+productID);
        System.out.println("product price:"+price);
        System.out.println("product discount"+(int)discount+"%");
        System.out.println("discountp price:"+CalculateDiscountPrice());
    }



}
