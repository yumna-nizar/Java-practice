import org.w3c.dom.css.Rect;

public class Rectangle {
    private int lenght;
    private int breadth;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
     public int areaOfRectangle()
    {
        return breadth*lenght;
    }
    public void displaydetails()
    {
        System.out.println("legnth = "+this.lenght);
        System.out.println("breadth = "+this.breadth);
        System.out.println("area = "+areaOfRectangle());

    }
    public void show(Rectangle this)
    {
        System.out.println(this.getLenght());
    }


}
