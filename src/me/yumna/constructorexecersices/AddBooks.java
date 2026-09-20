package me.yumna.constructorexecersices;

public class AddBooks {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.DisplayDetails();
        Book b2=new Book("yumna","the unbroken wings",51.0);
        b2.DisplayDetails();
        Book b3=new Book("Yusra","the kite little");
        b3.DisplayDetails();


    }
}
