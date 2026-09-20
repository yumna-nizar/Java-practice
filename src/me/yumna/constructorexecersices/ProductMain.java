package me.yumna.constructorexecersices;

public class ProductMain {
    public static void main(String[] args)
    {
        Product p1=new Product("soap","111",30,10);

        Product p2=new Product("ladies Kurti","112",700,40);
        p1.displaydetails();
        p2.displaydetails();

    }
}
