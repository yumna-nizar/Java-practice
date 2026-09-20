package me.yumna.constructorexecersices;

public class Book {
    private String title;
    private String author;
    private double price;


    public Book()
    {
        this("unknown","unknown");
        System.out.println("default");
    }

    public Book(String title,String author)
    {
     this(title,author,0.0);
        System.out.println("first");
    }

    public Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("second");
    }


    public void DisplayDetails()
    {
        System.out.println("title: "+title+" author: "+author+" price: "+price);
    }

}
